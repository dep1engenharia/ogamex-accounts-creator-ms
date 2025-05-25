<h1 align="center">🚀 OgameX Accounts Creator Microservice</h1>

This microservice automates the creation of new accounts on an OgameX game server using Selenium and Firefox.
It is packaged as a Docker container and exposes a REST API to trigger the automation.

📦 What It Does

 ```   Launches a headless Firefox browser

   - Accesses the game login page

   - Fills out the registration form with a random email

   - Uses a predefined password (ogame2025)

   - Submits the registration

   - Logs out and repeats the process

   - Returns a list of created email accounts 
```
📥 API Endpoint
---------------

**POST** `/accounts/generate`

### Parameters:

| Name   | Type    | Required | Description                                                        |
|--------|---------|----------|--------------------------------------------------------------------|
| count  | int     | No       | Number of accounts to create (default: 1)                          |
| ip     | string  | Yes      | IP of the host running the game (where the `/login` page is accessible) |


📨 Request Example:

![image](https://github.com/user-attachments/assets/e168ab86-03a0-4a18-a8e4-47206f57b9c2)

> **Note:** You can generate 1,000 accounts (or more) in a single request. However, this process may take a couple of hours depending on your machine's performance. This functionality is still under fine-tuning.

📤 Example Response:


```json
[
    {
        "email": "0f6c9772a7@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "80e2e2f24e@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "5d3d524ea6@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "71a4f0e6f9@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "2864cbd7df@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "68d8d77c78@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "89d2547537@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "178ff28545@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "c8f9d46d96@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "2fe7877685@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "fe4e03bd17@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "ad9d4eccde@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "3a3b497ff1@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "209ac1e0b4@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "38f4aca0f2@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "512d3dda2f@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "b2fc9a0fdd@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "6f4cdce252@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "5ccbfb2748@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "ef319bbdaf@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "3b773c1122@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "bbb7824147@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "e3a032db0a@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "c7a336e9e1@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "5530e39de0@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "b8d30aff30@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "cff0d4fcc8@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "62c963a4bd@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "4732784594@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "e081ceb96b@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "76de246698@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "999430244c@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "36f78c6749@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "eabe4e0362@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "aebbc9629b@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "fc18bec3c4@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "08b41edb3e@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "fc529761ca@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "9bb9ec59ee@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "c6d34399d3@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "df2f851d1e@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "d6e7598689@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "d0f5c86889@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "f713c7dd22@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "babefbeaff@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "b4474ab319@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "790b0844dd@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "2952d66f10@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "9131373504@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "dc92941242@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "2a07b79752@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "71118e98d3@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "d8862a8f8e@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "534cfbdf72@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "e5e922aa53@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "a4ea9b7bb6@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "5f03a30b8d@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "0c9483df03@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "ce9d8c5f09@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "a757f3473d@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "947dc5b458@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "d9880edaae@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "9b1a9d41b3@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "fe2e9675b6@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "0d1ca92ff6@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "0cd720fca9@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "c7f7b6819a@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "265e91744d@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "eec38feff8@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "b0a14dc9f4@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "804c89218e@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "a0a5c6622a@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "71b06b7f57@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "4d7ddecf09@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "9d67b737d2@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "712c93ddc2@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "0fecc8f947@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "ddd86bca0f@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "7e84fdd782@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "5b4ac57864@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "25e5931342@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "5d13ab27e8@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "6c5a1b09f9@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "aff577b71f@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "22be3193da@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "925df74e2f@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "274eea01d0@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "b16d4f7b16@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "fa409b1de9@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "32c9df2dfc@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "ffd0babc39@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "ccf4ba489f@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "50c5d7f849@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "80cb69766a@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "38f95d7d98@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "260831c30b@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "fe66c0eaaa@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "e553ac6e79@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "b64a007e37@gmail.com",
        "password": "ogame2025"
    },
    {
        "email": "b0700b93a0@gmail.com",
        "password": "ogame2025"
    }
]

```
![image](https://github.com/user-attachments/assets/0707d0cb-e616-4382-83ce-70c2c64923dc)


🐳 Docker
```
Pull the image:

docker pull a1vieira/ogamex-accounts-criator-ms:latest

Run the container:

docker run -d -p 8081:8081 a1vieira/ogamex-accounts-criator-ms:latest
```

## 🔮 Upcoming Features

This microservice will evolve beyond account creation — it will soon be able to assign different resources, facilities, and fleets to each account. The goal is to simulate a large-scale, vibrant universe where automation can even trigger attacks between players, bringing the **OgameX** universe to life. 🌌

## 🙌 Acknowledgements

Special thanks to [@lanedirt](https://github.com/lanedirt) for the incredible **OgameX** project. This microservice was built to integrate seamlessly with it, making account creation fast and automated. 🚀
