<?php
class Anggota{
 
    // database connection and table name
    private $conn;
    public $table_name;
 
    // object properties
    
    public $id;
    public $nik;
    
    // constructor with $db as database connection
    public function __construct($db){
        $this->conn = $db;
    }

    function insert(){
	
		$query = "INSERT INTO ". $this->table_name. " SET nik= :nik" ;
		//echo $query;
        $stmt = $this->conn->prepare($query);
		$stmt->bindParam(":nik", $this->nik);
        $stmt->execute();
		// execute query
		if($stmt->execute()){
			return true;
		}
		else {
			return false;
		}
    }

}

?>

