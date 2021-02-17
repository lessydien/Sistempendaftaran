<?php
	// required headers
	header("Access-Control-Allow-Origin: *");
	header("Content-Type: application/json; charset=UTF-8");
	
	include_once "database.php";
	include_once "Anggota.php";
	$database = new Database();
	$db = $database->getConnection();
	$anggota = new Anggota($db);
	
	if(isset($_GET['nik'])) {
		$nik = $_GET['nik'];
		//echo $nik;
		$anggota->table_name = 'anggota';
		$anggota->nik = $nik;
		$status = $anggota->insert();
		if($status){
			http_response_code(200);
			echo json_encode(
				array(
				"message" => "Berhasil disimpan",
				"status" => 1
				)
			);
		}
		else {
			http_response_code(404);
			echo json_encode(
				array(
				"message" => "Gagal disimpan",
				"status" => 0
				)
			);
		}
	
	}
	else {
		http_response_code(404);
		echo json_encode(
			array(
				"message" => "Gagal disimpan",
				"status" => 0
			)
		);
	}
	
	

	

?>