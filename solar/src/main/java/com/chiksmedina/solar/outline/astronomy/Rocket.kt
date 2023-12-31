package com.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.AstronomyGroup

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
                pathFillType = EvenOdd
            ) {
                moveTo(17.4058f, 1.25f)
                curveTo(17.4521f, 1.2501f, 17.4991f, 1.2501f, 17.5467f, 1.2501f)
                lineTo(18.1672f, 1.2501f)
                curveTo(19.0387f, 1.2501f, 19.7674f, 1.25f, 20.3463f, 1.3276f)
                curveTo(20.958f, 1.4096f, 21.5136f, 1.5904f, 21.9607f, 2.0361f)
                curveTo(22.4081f, 2.4822f, 22.5898f, 3.037f, 22.6722f, 3.6479f)
                curveTo(22.7501f, 4.2255f, 22.75f, 4.9524f, 22.75f, 5.821f)
                verticalLineTo(6.44f)
                curveTo(22.75f, 6.4877f, 22.75f, 6.5347f, 22.75f, 6.5812f)
                curveTo(22.7506f, 7.6312f, 22.751f, 8.3682f, 22.4708f, 9.0424f)
                curveTo(22.1908f, 9.7164f, 21.6682f, 10.2369f, 20.9231f, 10.9791f)
                curveTo(20.8901f, 11.0119f, 20.8568f, 11.0451f, 20.8229f, 11.0788f)
                lineTo(18.1532f, 13.7406f)
                lineTo(18.2462f, 13.8843f)
                curveTo(18.6399f, 14.4923f, 18.9588f, 14.9848f, 19.189f, 15.4095f)
                curveTo(19.4275f, 15.8494f, 19.5969f, 16.262f, 19.6648f, 16.7185f)
                curveTo(19.7739f, 17.4523f, 19.6753f, 18.2066f, 19.386f, 18.8996f)
                curveTo(19.2787f, 19.1566f, 19.0931f, 19.4259f, 18.9028f, 19.6714f)
                curveTo(18.7033f, 19.9286f, 18.4595f, 20.2088f, 18.1976f, 20.4941f)
                curveTo(17.6764f, 21.0621f, 17.0506f, 21.686f, 16.4952f, 22.2397f)
                lineTo(16.4041f, 22.3305f)
                curveTo(15.6842f, 23.0483f, 14.4363f, 22.8156f, 14.0523f, 21.8525f)
                curveTo(13.8247f, 21.2814f, 13.7326f, 21.0538f, 13.6173f, 20.8435f)
                curveTo(13.5104f, 20.6486f, 13.3877f, 20.4627f, 13.2505f, 20.2876f)
                curveTo(13.1044f, 20.1012f, 12.9337f, 19.9287f, 12.5104f, 19.5066f)
                lineTo(12.0056f, 19.064f)
                curveTo(11.9985f, 19.0578f, 11.9916f, 19.0515f, 11.9847f, 19.0451f)
                curveTo(11.8913f, 19.0572f, 11.7964f, 19.0634f, 11.6999f, 19.0634f)
                curveTo(11.0684f, 19.0634f, 10.5474f, 18.7998f, 10.0563f, 18.4262f)
                curveTo(9.5918f, 18.0729f, 9.0764f, 17.559f, 8.4602f, 16.9446f)
                lineTo(7.0136f, 15.5024f)
                curveTo(6.3974f, 14.8881f, 5.882f, 14.3743f, 5.5275f, 13.911f)
                curveTo(5.1529f, 13.4215f, 4.8876f, 12.901f, 4.8876f, 12.2693f)
                curveTo(4.8876f, 12.1547f, 4.8964f, 12.0425f, 4.9135f, 11.9325f)
                lineTo(4.083f, 11.1046f)
                curveTo(4.0346f, 11.0563f, 4.0153f, 11.037f, 3.9961f, 11.0185f)
                curveTo(3.6225f, 10.6559f, 3.1828f, 10.3675f, 2.7006f, 10.1689f)
                curveTo(2.676f, 10.1587f, 2.6505f, 10.1486f, 2.5868f, 10.1234f)
                lineTo(2.2082f, 9.9733f)
                curveTo(1.1947f, 9.5717f, 0.9218f, 8.2636f, 1.6956f, 7.4922f)
                lineTo(1.7027f, 7.4852f)
                curveTo(2.2581f, 6.9314f, 2.8838f, 6.3076f, 3.4535f, 5.7879f)
                curveTo(3.7397f, 5.5268f, 4.0207f, 5.2837f, 4.2786f, 5.0849f)
                curveTo(4.5249f, 4.8951f, 4.7947f, 4.7103f, 5.052f, 4.6036f)
                curveTo(5.7462f, 4.3155f, 6.5016f, 4.2174f, 7.2363f, 4.326f)
                curveTo(7.6932f, 4.3935f, 8.1064f, 4.562f, 8.5475f, 4.7997f)
                curveTo(8.9734f, 5.0292f, 9.4673f, 5.3471f, 10.0772f, 5.7396f)
                lineTo(10.2248f, 5.8347f)
                lineTo(12.8971f, 3.1704f)
                curveTo(12.9308f, 3.1369f, 12.964f, 3.1037f, 12.9968f, 3.071f)
                curveTo(13.7416f, 2.3277f, 14.2634f, 1.8069f, 14.9388f, 1.528f)
                curveTo(15.614f, 1.2492f, 16.3519f, 1.2495f, 17.4058f, 1.25f)
                close()
                moveTo(9.1375f, 6.9187f)
                curveTo(8.5775f, 6.5586f, 8.1744f, 6.3026f, 7.836f, 6.1202f)
                curveTo(7.4769f, 5.9268f, 7.2364f, 5.8423f, 7.017f, 5.8098f)
                curveTo(6.5588f, 5.7421f, 6.0775f, 5.8021f, 5.6268f, 5.989f)
                curveTo(5.5595f, 6.017f, 5.4178f, 6.1008f, 5.1943f, 6.273f)
                curveTo(4.9825f, 6.4363f, 4.7356f, 6.6487f, 4.4644f, 6.8961f)
                curveTo(3.9217f, 7.3912f, 3.3177f, 7.9931f, 2.7547f, 8.5545f)
                curveTo(2.7515f, 8.5576f, 2.7505f, 8.5594f, 2.7504f, 8.5595f)
                curveTo(2.7503f, 8.5597f, 2.7504f, 8.5595f, 2.7504f, 8.5595f)
                curveTo(2.7503f, 8.5599f, 2.7496f, 8.5628f, 2.7505f, 8.5674f)
                curveTo(2.7515f, 8.5719f, 2.7531f, 8.5744f, 2.7536f, 8.575f)
                curveTo(2.7539f, 8.5752f, 2.7563f, 8.5771f, 2.7608f, 8.5788f)
                lineTo(3.1445f, 8.7309f)
                curveTo(3.2015f, 8.7535f, 3.2369f, 8.7675f, 3.2721f, 8.782f)
                curveTo(3.93f, 9.0531f, 4.5303f, 9.4467f, 5.0407f, 9.9419f)
                curveTo(5.068f, 9.9684f, 5.0949f, 9.9952f, 5.1383f, 10.0385f)
                lineTo(5.616f, 10.5149f)
                curveTo(5.6814f, 10.4336f, 5.7497f, 10.353f, 5.8202f, 10.2725f)
                curveTo(6.142f, 9.9053f, 6.5554f, 9.4931f, 7.034f, 9.016f)
                lineTo(9.1375f, 6.9187f)
                close()
                moveTo(13.4546f, 18.3396f)
                lineTo(13.5354f, 18.4104f)
                lineTo(13.587f, 18.4619f)
                curveTo(13.9776f, 18.8513f, 14.2197f, 19.0926f, 14.4311f, 19.3624f)
                curveTo(14.6186f, 19.6016f, 14.7863f, 19.8557f, 14.9324f, 20.1222f)
                curveTo(15.0921f, 20.4133f, 15.2158f, 20.7203f, 15.4089f, 21.2047f)
                lineTo(15.4291f, 21.1845f)
                curveTo(15.9921f, 20.6231f, 16.5959f, 20.021f, 17.0925f, 19.4799f)
                curveTo(17.3406f, 19.2096f, 17.5536f, 18.9634f, 17.7174f, 18.7522f)
                curveTo(17.8901f, 18.5294f, 17.974f, 18.3884f, 18.0017f, 18.3218f)
                curveTo(18.189f, 17.8733f, 18.2488f, 17.3946f, 18.1811f, 16.9391f)
                curveTo(18.1487f, 16.7214f, 18.0643f, 16.4822f, 17.8703f, 16.1244f)
                curveTo(17.6871f, 15.7863f, 17.4297f, 15.3835f, 17.0672f, 14.8233f)
                lineTo(14.9586f, 16.9256f)
                curveTo(14.4687f, 17.414f, 14.0467f, 17.8348f, 13.6708f, 18.1594f)
                curveTo(13.5991f, 18.2214f, 13.5271f, 18.2816f, 13.4546f, 18.3396f)
                close()
                moveTo(17.5467f, 2.7501f)
                curveTo(16.2948f, 2.7501f, 15.8773f, 2.7633f, 15.5114f, 2.9144f)
                curveTo(15.1457f, 3.0654f, 14.8414f, 3.3501f, 13.9562f, 4.2327f)
                lineTo(8.1093f, 10.062f)
                curveTo(7.6109f, 10.5589f, 7.233f, 10.9362f, 6.9484f, 11.2611f)
                curveTo(6.6624f, 11.5874f, 6.5164f, 11.8109f, 6.4454f, 11.9874f)
                curveTo(6.404f, 12.0903f, 6.3876f, 12.1792f, 6.3876f, 12.2693f)
                curveTo(6.3876f, 12.4398f, 6.446f, 12.643f, 6.7188f, 12.9994f)
                curveTo(7.0047f, 13.3731f, 7.4469f, 13.8162f, 8.1093f, 14.4767f)
                lineTo(8.2665f, 14.6333f)
                lineTo(9.797f, 13.1074f)
                curveTo(10.0903f, 12.815f, 10.5652f, 12.8157f, 10.8576f, 13.109f)
                curveTo(11.1501f, 13.4024f, 11.1494f, 13.8772f, 10.856f, 14.1697f)
                lineTo(9.3287f, 15.6924f)
                lineTo(9.4827f, 15.8459f)
                curveTo(10.1451f, 16.5063f, 10.5896f, 16.9473f, 10.9644f, 17.2324f)
                curveTo(11.3219f, 17.5043f, 11.5268f, 17.5634f, 11.6999f, 17.5634f)
                curveTo(11.7847f, 17.5634f, 11.8672f, 17.5491f, 11.9596f, 17.5151f)
                curveTo(12.135f, 17.4505f, 12.3586f, 17.3107f, 12.6904f, 17.0241f)
                curveTo(13.021f, 16.7387f, 13.4057f, 16.3557f, 13.917f, 15.8459f)
                lineTo(19.7639f, 10.0166f)
                curveTo(20.6494f, 9.1337f, 20.9345f, 8.8307f, 21.0856f, 8.4669f)
                curveTo(21.2367f, 8.1034f, 21.25f, 7.6886f, 21.25f, 6.44f)
                verticalLineTo(5.8729f)
                curveTo(21.25f, 4.9388f, 21.2484f, 4.3139f, 21.1856f, 3.8484f)
                curveTo(21.1258f, 3.4046f, 21.0231f, 3.2195f, 20.9016f, 3.0984f)
                curveTo(20.7798f, 2.977f, 20.5932f, 2.8741f, 20.1471f, 2.8143f)
                curveTo(19.6796f, 2.7517f, 19.0523f, 2.7501f, 18.1156f, 2.7501f)
                horizontalLineTo(17.5467f)
                close()
                moveTo(16.6637f, 7.3235f)
                curveTo(16.198f, 6.8592f, 15.4419f, 6.8592f, 14.9761f, 7.3235f)
                curveTo(14.5116f, 7.7867f, 14.5116f, 8.5366f, 14.9761f, 8.9997f)
                curveTo(15.4419f, 9.4641f, 16.198f, 9.4641f, 16.6637f, 8.9997f)
                curveTo(17.1283f, 8.5366f, 17.1283f, 7.7867f, 16.6637f, 7.3235f)
                close()
                moveTo(13.917f, 6.2613f)
                curveTo(14.9682f, 5.2132f, 16.6716f, 5.2132f, 17.7228f, 6.2613f)
                curveTo(18.7752f, 7.3106f, 18.7752f, 9.0127f, 17.7228f, 10.062f)
                curveTo(16.6716f, 11.11f, 14.9682f, 11.11f, 13.917f, 10.062f)
                curveTo(12.8646f, 9.0127f, 12.8646f, 7.3106f, 13.917f, 6.2613f)
                close()
            }
        }
            .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
