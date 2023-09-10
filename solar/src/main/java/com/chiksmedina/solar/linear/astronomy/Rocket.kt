package com.chiksmedina.solar.linear.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.AstronomyGroup

val AstronomyGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(
            name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5798f, 15.0077f)
                lineTo(8.1093f, 14.4766f)
                lineTo(8.1093f, 14.4766f)
                lineTo(7.5798f, 15.0077f)
                close()
                moveTo(7.5798f, 9.5308f)
                lineTo(7.0503f, 8.9997f)
                lineTo(7.0503f, 8.9997f)
                lineTo(7.5798f, 9.5308f)
                close()
                moveTo(14.4466f, 16.3769f)
                lineTo(13.917f, 15.8458f)
                lineTo(13.917f, 15.8458f)
                lineTo(14.4466f, 16.3769f)
                close()
                moveTo(8.9532f, 16.3769f)
                lineTo(8.4236f, 16.9081f)
                lineTo(8.4236f, 16.9081f)
                lineTo(8.9532f, 16.3769f)
                close()
                moveTo(11.6999f, 18.3133f)
                lineTo(11.6999f, 19.0633f)
                lineTo(11.6999f, 18.3133f)
                close()
                moveTo(20.2934f, 10.5476f)
                lineTo(20.823f, 11.0788f)
                lineTo(20.2934f, 10.5476f)
                close()
                moveTo(13.4267f, 3.7015f)
                lineTo(13.9562f, 4.2326f)
                lineTo(13.9562f, 4.2326f)
                lineTo(13.4267f, 3.7015f)
                close()
                moveTo(10.856f, 14.1696f)
                curveTo(11.1494f, 13.8771f, 11.1501f, 13.4023f, 10.8576f, 13.1089f)
                curveTo(10.5652f, 12.8156f, 10.0903f, 12.8149f, 9.797f, 13.1073f)
                lineTo(10.856f, 14.1696f)
                close()
                moveTo(5.5733f, 11.5312f)
                lineTo(6.1037f, 11.0009f)
                lineTo(6.1029f, 11.0001f)
                lineTo(5.5733f, 11.5312f)
                close()
                moveTo(9.9196f, 7.422f)
                curveTo(10.2679f, 7.6461f, 10.732f, 7.5455f, 10.9561f, 7.1972f)
                curveTo(11.1803f, 6.8489f, 11.0797f, 6.3848f, 10.7314f, 6.1606f)
                lineTo(9.9196f, 7.422f)
                close()
                moveTo(9.6963f, 6.3863f)
                lineTo(10.1022f, 5.7557f)
                lineTo(10.1022f, 5.7557f)
                lineTo(9.6963f, 6.3863f)
                close()
                moveTo(7.1266f, 5.0678f)
                lineTo(7.2363f, 4.3259f)
                lineTo(7.1266f, 5.0678f)
                close()
                moveTo(2.2251f, 8.0232f)
                lineTo(2.7547f, 8.5544f)
                lineTo(2.7547f, 8.5544f)
                lineTo(2.2251f, 8.0232f)
                close()
                moveTo(5.3394f, 5.2962f)
                lineTo(5.6268f, 5.9889f)
                lineTo(5.6268f, 5.9889f)
                lineTo(5.3394f, 5.2962f)
                close()
                moveTo(2.8631f, 9.426f)
                lineTo(2.5868f, 10.1233f)
                lineTo(2.5869f, 10.1233f)
                lineTo(2.8631f, 9.426f)
                close()
                moveTo(2.9864f, 9.4753f)
                lineTo(3.2721f, 8.7819f)
                lineTo(3.2721f, 8.7819f)
                lineTo(2.9864f, 9.4753f)
                close()
                moveTo(4.6126f, 10.5734f)
                lineTo(5.1421f, 10.0423f)
                lineTo(5.1421f, 10.0423f)
                lineTo(4.6126f, 10.5734f)
                close()
                moveTo(4.5184f, 10.4801f)
                lineTo(3.9961f, 11.0184f)
                lineTo(4.5184f, 10.4801f)
                close()
                moveTo(2.4845f, 9.276f)
                lineTo(2.7608f, 8.5787f)
                lineTo(2.7608f, 8.5787f)
                lineTo(2.4845f, 9.276f)
                close()
                moveTo(12.5f, 18.5f)
                lineTo(11.9697f, 19.0303f)
                curveTo(11.9813f, 19.0419f, 11.9932f, 19.0531f, 12.0056f, 19.0639f)
                lineTo(12.5f, 18.5f)
                close()
                moveTo(17.8238f, 13.2319f)
                curveTo(17.5987f, 12.8842f, 17.1344f, 12.7848f, 16.7867f, 13.0099f)
                curveTo(16.439f, 13.2351f, 16.3396f, 13.6994f, 16.5647f, 14.0471f)
                lineTo(17.8238f, 13.2319f)
                close()
                moveTo(17.6005f, 14.2668f)
                lineTo(16.9709f, 14.6745f)
                lineTo(16.9709f, 14.6745f)
                lineTo(17.6005f, 14.2668f)
                close()
                moveTo(18.923f, 16.8287f)
                lineTo(19.6648f, 16.7184f)
                lineTo(19.6648f, 16.7184f)
                lineTo(18.923f, 16.8287f)
                close()
                moveTo(15.9586f, 21.7155f)
                lineTo(16.4882f, 22.2467f)
                lineTo(16.4882f, 22.2467f)
                lineTo(15.9586f, 21.7155f)
                close()
                moveTo(18.6939f, 18.6106f)
                lineTo(19.386f, 18.8995f)
                lineTo(18.6939f, 18.6106f)
                close()
                moveTo(14.749f, 21.5747f)
                lineTo(15.4457f, 21.2969f)
                lineTo(15.4457f, 21.2969f)
                lineTo(14.749f, 21.5747f)
                close()
                moveTo(14.2748f, 20.4828f)
                lineTo(14.9324f, 20.1221f)
                lineTo(14.2748f, 20.4828f)
                close()
                moveTo(13.0229f, 18.9584f)
                lineTo(13.5524f, 18.4273f)
                lineTo(13.5354f, 18.4104f)
                lineTo(13.5173f, 18.3945f)
                lineTo(13.0229f, 18.9584f)
                close()
                moveTo(13.8408f, 19.8249f)
                lineTo(14.4311f, 19.3623f)
                lineTo(13.8408f, 19.8249f)
                close()
                moveTo(15.8746f, 21.7993f)
                lineTo(15.3451f, 21.2682f)
                lineTo(15.3451f, 21.2682f)
                lineTo(15.8746f, 21.7993f)
                close()
                moveTo(5.7496f, 11.7075f)
                lineTo(6.4454f, 11.9873f)
                lineTo(5.7496f, 11.7075f)
                close()
                moveTo(19.7639f, 10.0165f)
                lineTo(13.917f, 15.8458f)
                lineTo(14.9761f, 16.9081f)
                lineTo(20.823f, 11.0788f)
                lineTo(19.7639f, 10.0165f)
                close()
                moveTo(9.4827f, 15.8458f)
                lineTo(8.1093f, 14.4766f)
                lineTo(7.0503f, 15.5388f)
                lineTo(8.4236f, 16.9081f)
                lineTo(9.4827f, 15.8458f)
                close()
                moveTo(8.1093f, 10.0619f)
                lineTo(13.9562f, 4.2326f)
                lineTo(12.8971f, 3.1703f)
                lineTo(7.0503f, 8.9997f)
                lineTo(8.1093f, 10.0619f)
                close()
                moveTo(17.5467f, 2.75f)
                horizontalLineTo(18.1156f)
                verticalLineTo(1.25f)
                horizontalLineTo(17.5467f)
                verticalLineTo(2.75f)
                close()
                moveTo(21.25f, 5.8728f)
                verticalLineTo(6.4399f)
                horizontalLineTo(22.75f)
                verticalLineTo(5.8728f)
                horizontalLineTo(21.25f)
                close()
                moveTo(18.1156f, 2.75f)
                curveTo(19.0523f, 2.75f, 19.6796f, 2.7516f, 20.1471f, 2.8142f)
                curveTo(20.5932f, 2.874f, 20.7798f, 2.9769f, 20.9016f, 3.0983f)
                lineTo(21.9607f, 2.036f)
                curveTo(21.5136f, 1.5903f, 20.958f, 1.4095f, 20.3464f, 1.3275f)
                curveTo(19.7561f, 1.2484f, 19.01f, 1.25f, 18.1156f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(22.75f, 5.8728f)
                curveTo(22.75f, 4.9812f, 22.7516f, 4.2369f, 22.6722f, 3.6478f)
                curveTo(22.5898f, 3.0369f, 22.4081f, 2.4821f, 21.9607f, 2.036f)
                lineTo(20.9016f, 3.0983f)
                curveTo(21.0231f, 3.2194f, 21.1258f, 3.4045f, 21.1856f, 3.8483f)
                curveTo(21.2484f, 4.3138f, 21.25f, 4.9387f, 21.25f, 5.8728f)
                horizontalLineTo(22.75f)
                close()
                moveTo(8.1093f, 14.4766f)
                curveTo(7.4469f, 13.8161f, 7.0047f, 13.373f, 6.7188f, 12.9994f)
                curveTo(6.446f, 12.643f, 6.3876f, 12.4397f, 6.3876f, 12.2692f)
                horizontalLineTo(4.8876f)
                curveTo(4.8876f, 12.9009f, 5.1529f, 13.4214f, 5.5275f, 13.911f)
                curveTo(5.889f, 14.3833f, 6.4179f, 14.9084f, 7.0503f, 15.5388f)
                lineTo(8.1093f, 14.4766f)
                close()
                moveTo(8.4236f, 16.9081f)
                curveTo(9.056f, 17.5386f, 9.5826f, 18.0658f, 10.0563f, 18.4262f)
                curveTo(10.5474f, 18.7997f, 11.0684f, 19.0633f, 11.6999f, 19.0633f)
                lineTo(11.6999f, 17.5633f)
                curveTo(11.5268f, 17.5633f, 11.3219f, 17.5042f, 10.9644f, 17.2323f)
                curveTo(10.5896f, 16.9472f, 10.1451f, 16.5062f, 9.4827f, 15.8458f)
                lineTo(8.4236f, 16.9081f)
                close()
                moveTo(20.823f, 11.0788f)
                curveTo(21.6215f, 10.2826f, 22.1784f, 9.7461f, 22.4708f, 9.0423f)
                lineTo(21.0856f, 8.4668f)
                curveTo(20.9345f, 8.8306f, 20.6494f, 9.1336f, 19.7639f, 10.0165f)
                lineTo(20.823f, 11.0788f)
                close()
                moveTo(21.25f, 6.4399f)
                curveTo(21.25f, 7.6885f, 21.2367f, 8.1033f, 21.0856f, 8.4668f)
                lineTo(22.4708f, 9.0423f)
                curveTo(22.7633f, 8.3383f, 22.75f, 7.5658f, 22.75f, 6.4399f)
                horizontalLineTo(21.25f)
                close()
                moveTo(13.9562f, 4.2326f)
                curveTo(14.8414f, 3.35f, 15.1457f, 3.0653f, 15.5114f, 2.9143f)
                lineTo(14.9388f, 1.5279f)
                curveTo(14.2337f, 1.8191f, 13.696f, 2.3739f, 12.8971f, 3.1703f)
                lineTo(13.9562f, 4.2326f)
                close()
                moveTo(17.5467f, 1.25f)
                curveTo(16.4169f, 1.25f, 15.6437f, 1.2368f, 14.9388f, 1.5279f)
                lineTo(15.5114f, 2.9143f)
                curveTo(15.8773f, 2.7632f, 16.2948f, 2.75f, 17.5467f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(8.796f, 16.2234f)
                lineTo(10.856f, 14.1696f)
                lineTo(9.797f, 13.1073f)
                lineTo(7.7369f, 15.1612f)
                lineTo(8.796f, 16.2234f)
                close()
                moveTo(10.7314f, 6.1606f)
                lineTo(10.1022f, 5.7557f)
                lineTo(9.2904f, 7.017f)
                lineTo(9.9196f, 7.422f)
                lineTo(10.7314f, 6.1606f)
                close()
                moveTo(10.1022f, 5.7557f)
                curveTo(9.4808f, 5.3557f, 8.9792f, 5.0323f, 8.5475f, 4.7997f)
                curveTo(8.1064f, 4.562f, 7.6932f, 4.3934f, 7.2363f, 4.3259f)
                lineTo(7.017f, 5.8097f)
                curveTo(7.2364f, 5.8422f, 7.4769f, 5.9267f, 7.836f, 6.1201f)
                curveTo(8.2045f, 6.3187f, 8.6496f, 6.6046f, 9.2904f, 7.017f)
                lineTo(10.1022f, 5.7557f)
                close()
                moveTo(2.7547f, 8.5544f)
                curveTo(3.3177f, 7.993f, 3.9217f, 7.3911f, 4.4644f, 6.896f)
                curveTo(4.7356f, 6.6486f, 4.9825f, 6.4362f, 5.1943f, 6.2729f)
                curveTo(5.4178f, 6.1007f, 5.5595f, 6.0169f, 5.6268f, 5.9889f)
                lineTo(5.052f, 4.6035f)
                curveTo(4.7947f, 4.7102f, 4.5249f, 4.895f, 4.2786f, 5.0848f)
                curveTo(4.0207f, 5.2836f, 3.7397f, 5.5267f, 3.4535f, 5.7878f)
                curveTo(2.8814f, 6.3097f, 2.2528f, 6.9366f, 1.6956f, 7.4921f)
                lineTo(2.7547f, 8.5544f)
                close()
                moveTo(7.2363f, 4.3259f)
                curveTo(6.5016f, 4.2173f, 5.7462f, 4.3154f, 5.052f, 4.6035f)
                lineTo(5.6268f, 5.9889f)
                curveTo(6.0775f, 5.8019f, 6.5588f, 5.742f, 7.017f, 5.8097f)
                lineTo(7.2363f, 4.3259f)
                close()
                moveTo(2.2082f, 9.9733f)
                lineTo(2.5868f, 10.1233f)
                lineTo(3.1394f, 8.7288f)
                lineTo(2.7608f, 8.5787f)
                lineTo(2.2082f, 9.9733f)
                close()
                moveTo(4.0831f, 11.1045f)
                lineTo(5.0438f, 12.0624f)
                lineTo(6.1029f, 11.0001f)
                lineTo(5.1421f, 10.0423f)
                lineTo(4.0831f, 11.1045f)
                close()
                moveTo(2.5869f, 10.1233f)
                curveTo(2.6505f, 10.1485f, 2.676f, 10.1586f, 2.7006f, 10.1688f)
                lineTo(3.2721f, 8.7819f)
                curveTo(3.2358f, 8.767f, 3.1995f, 8.7526f, 3.1394f, 8.7288f)
                lineTo(2.5869f, 10.1233f)
                close()
                moveTo(5.1421f, 10.0423f)
                curveTo(5.0964f, 9.9967f, 5.0688f, 9.9691f, 5.0407f, 9.9418f)
                lineTo(3.9961f, 11.0184f)
                curveTo(4.0153f, 11.0369f, 4.0346f, 11.0562f, 4.0831f, 11.1045f)
                lineTo(5.1421f, 10.0423f)
                close()
                moveTo(2.7006f, 10.1688f)
                curveTo(3.1828f, 10.3674f, 3.6225f, 10.6558f, 3.9961f, 11.0184f)
                lineTo(5.0407f, 9.9418f)
                curveTo(4.5303f, 9.4466f, 3.93f, 9.053f, 3.2721f, 8.7819f)
                lineTo(2.7006f, 10.1688f)
                close()
                moveTo(1.6956f, 7.4921f)
                curveTo(0.9218f, 8.2635f, 1.1947f, 9.5716f, 2.2082f, 9.9733f)
                lineTo(2.7608f, 8.5787f)
                curveTo(2.7563f, 8.577f, 2.7545f, 8.5757f, 2.7542f, 8.5754f)
                curveTo(2.7539f, 8.5752f, 2.7538f, 8.575f, 2.7536f, 8.5749f)
                curveTo(2.7531f, 8.5743f, 2.7515f, 8.5718f, 2.7505f, 8.5673f)
                curveTo(2.7496f, 8.5627f, 2.7502f, 8.56f, 2.7503f, 8.5596f)
                curveTo(2.7503f, 8.5596f, 2.7503f, 8.5597f, 2.7504f, 8.5595f)
                curveTo(2.7504f, 8.5594f, 2.7514f, 8.5576f, 2.7547f, 8.5544f)
                lineTo(1.6956f, 7.4921f)
                close()
                moveTo(16.5647f, 14.0471f)
                lineTo(16.9709f, 14.6745f)
                lineTo(18.23f, 13.8592f)
                lineTo(17.8238f, 13.2319f)
                lineTo(16.5647f, 14.0471f)
                close()
                moveTo(15.4291f, 21.1844f)
                lineTo(15.3451f, 21.2682f)
                lineTo(16.4041f, 22.3304f)
                lineTo(16.4882f, 22.2467f)
                lineTo(15.4291f, 21.1844f)
                close()
                moveTo(16.9709f, 14.6745f)
                curveTo(17.3846f, 15.3134f, 17.6713f, 15.757f, 17.8703f, 16.1243f)
                curveTo(18.0643f, 16.4821f, 18.1488f, 16.7213f, 18.1811f, 16.939f)
                lineTo(19.6648f, 16.7184f)
                curveTo(19.5969f, 16.2619f, 19.4275f, 15.8493f, 19.189f, 15.4094f)
                curveTo(18.9557f, 14.9789f, 18.6312f, 14.4787f, 18.23f, 13.8592f)
                lineTo(16.9709f, 14.6745f)
                close()
                moveTo(16.4882f, 22.2467f)
                curveTo(17.0453f, 21.6912f, 17.6742f, 21.0644f, 18.1976f, 20.4941f)
                curveTo(18.4595f, 20.2087f, 18.7033f, 19.9285f, 18.9028f, 19.6713f)
                curveTo(19.0931f, 19.4258f, 19.2787f, 19.1565f, 19.386f, 18.8995f)
                lineTo(18.0018f, 18.3217f)
                curveTo(17.974f, 18.3883f, 17.8901f, 18.5293f, 17.7174f, 18.7521f)
                curveTo(17.5536f, 18.9633f, 17.3406f, 19.2095f, 17.0925f, 19.4798f)
                curveTo(16.5959f, 20.0209f, 15.9922f, 20.623f, 15.4291f, 21.1844f)
                lineTo(16.4882f, 22.2467f)
                close()
                moveTo(18.1811f, 16.939f)
                curveTo(18.2488f, 17.3945f, 18.189f, 17.8732f, 18.0018f, 18.3217f)
                lineTo(19.386f, 18.8995f)
                curveTo(19.6753f, 18.2065f, 19.7739f, 17.4522f, 19.6648f, 16.7184f)
                lineTo(18.1811f, 16.939f)
                close()
                moveTo(13.5173f, 18.3945f)
                lineTo(12.9944f, 17.9361f)
                lineTo(12.0056f, 19.0639f)
                lineTo(12.5284f, 19.5224f)
                lineTo(13.5173f, 18.3945f)
                close()
                moveTo(15.4457f, 21.2969f)
                curveTo(15.231f, 20.7584f, 15.102f, 20.4313f, 14.9324f, 20.1221f)
                lineTo(13.6173f, 20.8435f)
                curveTo(13.7326f, 21.0537f, 13.8247f, 21.2813f, 14.0523f, 21.8524f)
                lineTo(15.4457f, 21.2969f)
                close()
                moveTo(12.4933f, 19.4896f)
                curveTo(12.9291f, 19.9241f, 13.1025f, 20.0987f, 13.2505f, 20.2875f)
                lineTo(14.4311f, 19.3623f)
                curveTo(14.2136f, 19.0847f, 13.9635f, 18.8371f, 13.5524f, 18.4273f)
                lineTo(12.4933f, 19.4896f)
                close()
                moveTo(14.9324f, 20.1221f)
                curveTo(14.7863f, 19.8556f, 14.6186f, 19.6015f, 14.4311f, 19.3623f)
                lineTo(13.2505f, 20.2875f)
                curveTo(13.3877f, 20.4626f, 13.5104f, 20.6485f, 13.6173f, 20.8435f)
                lineTo(14.9324f, 20.1221f)
                close()
                moveTo(16.6637f, 8.9997f)
                curveTo(16.198f, 9.464f, 15.4419f, 9.464f, 14.9761f, 8.9997f)
                lineTo(13.917f, 10.0619f)
                curveTo(14.9682f, 11.1099f, 16.6716f, 11.1099f, 17.7228f, 10.0619f)
                lineTo(16.6637f, 8.9997f)
                close()
                moveTo(14.9761f, 8.9997f)
                curveTo(14.5116f, 8.5365f, 14.5116f, 7.7866f, 14.9761f, 7.3234f)
                lineTo(13.917f, 6.2612f)
                curveTo(12.8646f, 7.3105f, 12.8646f, 9.0126f, 13.917f, 10.0619f)
                lineTo(14.9761f, 8.9997f)
                close()
                moveTo(14.9761f, 7.3234f)
                curveTo(15.4419f, 6.8591f, 16.198f, 6.8591f, 16.6637f, 7.3234f)
                lineTo(17.7228f, 6.2612f)
                curveTo(16.6716f, 5.2132f, 14.9682f, 5.2132f, 13.917f, 6.2612f)
                lineTo(14.9761f, 7.3234f)
                close()
                moveTo(16.6637f, 7.3234f)
                curveTo(17.1283f, 7.7866f, 17.1283f, 8.5365f, 16.6637f, 8.9997f)
                lineTo(17.7228f, 10.0619f)
                curveTo(18.7752f, 9.0126f, 18.7752f, 7.3105f, 17.7228f, 6.2612f)
                lineTo(16.6637f, 7.3234f)
                close()
                moveTo(15.3451f, 21.2682f)
                curveTo(15.3514f, 21.2619f, 15.3619f, 21.2554f, 15.3735f, 21.2522f)
                curveTo(15.3833f, 21.2494f, 15.3907f, 21.2497f, 15.3959f, 21.2508f)
                curveTo(15.401f, 21.2518f, 15.4096f, 21.2546f, 15.4199f, 21.2628f)
                curveTo(15.4316f, 21.2722f, 15.441f, 21.2852f, 15.4457f, 21.2969f)
                lineTo(14.0523f, 21.8524f)
                curveTo(14.4363f, 22.8155f, 15.6842f, 23.0482f, 16.4041f, 22.3304f)
                lineTo(15.3451f, 21.2682f)
                close()
                moveTo(13.917f, 15.8458f)
                curveTo(13.4057f, 16.3556f, 13.021f, 16.7386f, 12.6904f, 17.0241f)
                curveTo(12.3586f, 17.3106f, 12.135f, 17.4504f, 11.9596f, 17.515f)
                lineTo(12.478f, 18.9226f)
                curveTo(12.9059f, 18.765f, 13.2918f, 18.4867f, 13.6708f, 18.1593f)
                curveTo(14.0512f, 17.8308f, 14.4787f, 17.404f, 14.9761f, 16.9081f)
                lineTo(13.917f, 15.8458f)
                close()
                moveTo(11.9596f, 17.515f)
                curveTo(11.8672f, 17.5491f, 11.7847f, 17.5633f, 11.6999f, 17.5633f)
                lineTo(11.6999f, 19.0633f)
                curveTo(11.9706f, 19.0633f, 12.2282f, 19.0146f, 12.478f, 18.9226f)
                lineTo(11.9596f, 17.515f)
                close()
                moveTo(13.0303f, 17.9697f)
                lineTo(12.7491f, 17.6885f)
                lineTo(11.6885f, 18.7491f)
                lineTo(11.9697f, 19.0303f)
                lineTo(13.0303f, 17.9697f)
                close()
                moveTo(7.0503f, 8.9997f)
                curveTo(6.5648f, 9.4837f, 6.1456f, 9.901f, 5.8202f, 10.2724f)
                curveTo(5.4962f, 10.6423f, 5.219f, 11.0167f, 5.0537f, 11.4277f)
                lineTo(6.4454f, 11.9873f)
                curveTo(6.5164f, 11.8108f, 6.6624f, 11.5874f, 6.9484f, 11.261f)
                curveTo(7.233f, 10.9361f, 7.6109f, 10.5588f, 8.1093f, 10.0619f)
                lineTo(7.0503f, 8.9997f)
                close()
                moveTo(5.0537f, 11.4277f)
                curveTo(4.9458f, 11.696f, 4.8876f, 11.9743f, 4.8876f, 12.2692f)
                horizontalLineTo(6.3876f)
                curveTo(6.3876f, 12.1791f, 6.404f, 12.0902f, 6.4454f, 11.9873f)
                lineTo(5.0537f, 11.4277f)
                close()
                moveTo(5.043f, 12.0616f)
                lineTo(5.2192f, 12.2378f)
                lineTo(6.2799f, 11.1771f)
                lineTo(6.1037f, 11.0009f)
                lineTo(5.043f, 12.0616f)
                close()
            }
        }
            .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
