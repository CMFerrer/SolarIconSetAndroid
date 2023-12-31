package com.chiksmedina.solar.lineduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.AstronomyGroup

val AstronomyGroup.Rocket2: ImageVector
    get() {
        if (_rocket2 != null) {
            return _rocket2!!
        }
        _rocket2 = Builder(
            name = "Rocket2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 5.3652f)
                lineTo(22.75f, 5.3652f)
                verticalLineTo(5.3652f)
                horizontalLineTo(22.0f)
                close()
                moveTo(9.4545f, 13.3029f)
                lineTo(9.9837f, 12.7714f)
                lineTo(9.9837f, 12.7714f)
                lineTo(9.4545f, 13.3029f)
                close()
                moveTo(9.4545f, 8.5438f)
                lineTo(9.9837f, 9.0752f)
                lineTo(9.4545f, 8.5438f)
                close()
                moveTo(15.4285f, 14.4926f)
                lineTo(14.8993f, 13.9612f)
                lineTo(14.8993f, 13.9612f)
                lineTo(15.4285f, 14.4926f)
                close()
                moveTo(10.6493f, 14.4926f)
                lineTo(10.1201f, 15.0241f)
                lineTo(10.1201f, 15.0241f)
                lineTo(10.6493f, 14.4926f)
                close()
                moveTo(20.5152f, 9.4273f)
                lineTo(21.0444f, 9.9588f)
                lineTo(21.0444f, 9.9588f)
                lineTo(20.5152f, 9.4273f)
                close()
                moveTo(22.0f, 5.858f)
                lineTo(21.25f, 5.858f)
                verticalLineTo(5.858f)
                horizontalLineTo(22.0f)
                close()
                moveTo(14.5412f, 3.4785f)
                lineTo(14.012f, 2.947f)
                lineTo(14.012f, 2.947f)
                lineTo(14.5412f, 3.4785f)
                close()
                moveTo(13.4904f, 16.0931f)
                lineTo(13.2314f, 15.3892f)
                lineTo(13.4904f, 16.0931f)
                close()
                moveTo(7.8622f, 10.4352f)
                lineTo(8.5579f, 10.7153f)
                lineTo(7.8622f, 10.4352f)
                close()
                moveTo(19.986f, 8.8959f)
                lineTo(14.8993f, 13.9612f)
                lineTo(15.9577f, 15.0241f)
                lineTo(21.0444f, 9.9588f)
                lineTo(19.986f, 8.8959f)
                close()
                moveTo(11.1785f, 13.9612f)
                lineTo(9.9837f, 12.7714f)
                lineTo(8.9253f, 13.8343f)
                lineTo(10.1201f, 15.0241f)
                lineTo(11.1785f, 13.9612f)
                close()
                moveTo(9.9837f, 9.0752f)
                lineTo(15.0704f, 4.0099f)
                lineTo(14.012f, 2.947f)
                lineTo(8.9253f, 8.0123f)
                lineTo(9.9837f, 9.0752f)
                close()
                moveTo(18.1256f, 2.75f)
                horizontalLineTo(18.6205f)
                verticalLineTo(1.25f)
                horizontalLineTo(18.1256f)
                verticalLineTo(2.75f)
                close()
                moveTo(21.25f, 5.3652f)
                lineTo(21.25f, 5.858f)
                lineTo(22.75f, 5.858f)
                lineTo(22.75f, 5.3652f)
                lineTo(21.25f, 5.3652f)
                close()
                moveTo(18.6205f, 2.75f)
                curveTo(19.4382f, 2.75f, 19.9763f, 2.7516f, 20.3751f, 2.805f)
                curveTo(20.7526f, 2.8555f, 20.8911f, 2.9399f, 20.9758f, 3.0243f)
                lineTo(22.0343f, 1.9614f)
                curveTo(21.6241f, 1.553f, 21.1169f, 1.3909f, 20.5741f, 1.3182f)
                curveTo(20.0527f, 1.2484f, 19.396f, 1.25f, 18.6205f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(22.75f, 5.3652f)
                curveTo(22.75f, 4.5933f, 22.7516f, 3.9386f, 22.6813f, 3.4186f)
                curveTo(22.6082f, 2.8766f, 22.4448f, 2.3702f, 22.0343f, 1.9614f)
                lineTo(20.9758f, 3.0243f)
                curveTo(21.0602f, 3.1082f, 21.1443f, 3.2448f, 21.1948f, 3.6193f)
                curveTo(21.2483f, 4.0156f, 21.25f, 4.5507f, 21.25f, 5.3652f)
                horizontalLineTo(22.75f)
                close()
                moveTo(9.9837f, 12.7714f)
                curveTo(9.4054f, 12.1956f, 9.0263f, 11.8158f, 8.7825f, 11.4976f)
                curveTo(8.5519f, 11.1966f, 8.5148f, 11.0409f, 8.5148f, 10.9233f)
                horizontalLineTo(7.0148f)
                curveTo(7.0148f, 11.5027f, 7.2593f, 11.9759f, 7.5919f, 12.4099f)
                curveTo(7.9113f, 12.8269f, 8.3771f, 13.2884f, 8.9253f, 13.8343f)
                lineTo(9.9837f, 12.7714f)
                close()
                moveTo(10.1201f, 15.0241f)
                curveTo(10.6683f, 15.57f, 11.1318f, 16.0338f, 11.5503f, 16.3518f)
                curveTo(11.9863f, 16.683f, 12.46f, 16.9252f, 13.0389f, 16.9252f)
                verticalLineTo(15.4252f)
                curveTo(12.9179f, 15.4252f, 12.76f, 15.387f, 12.4578f, 15.1574f)
                curveTo(12.1381f, 14.9145f, 11.7567f, 14.537f, 11.1785f, 13.9612f)
                lineTo(10.1201f, 15.0241f)
                close()
                moveTo(21.0444f, 9.9588f)
                curveTo(21.7335f, 9.2727f, 22.2358f, 8.7912f, 22.4995f, 8.1573f)
                lineTo(21.1145f, 7.5813f)
                curveTo(20.9924f, 7.875f, 20.7621f, 8.123f, 19.986f, 8.8959f)
                lineTo(21.0444f, 9.9588f)
                close()
                moveTo(21.25f, 5.858f)
                curveTo(21.25f, 6.951f, 21.2366f, 7.2878f, 21.1145f, 7.5813f)
                lineTo(22.4995f, 8.1573f)
                curveTo(22.7633f, 7.5231f, 22.75f, 6.8283f, 22.75f, 5.858f)
                horizontalLineTo(21.25f)
                close()
                moveTo(15.0704f, 4.0099f)
                curveTo(15.8462f, 3.2374f, 16.0957f, 3.0076f, 16.3918f, 2.8855f)
                lineTo(15.8199f, 1.4988f)
                curveTo(15.1844f, 1.7609f, 14.7014f, 2.2605f, 14.012f, 2.947f)
                lineTo(15.0704f, 4.0099f)
                close()
                moveTo(18.1256f, 1.25f)
                curveTo(17.1506f, 1.25f, 16.455f, 1.2368f, 15.8199f, 1.4988f)
                lineTo(16.3918f, 2.8855f)
                curveTo(16.6883f, 2.7632f, 17.0286f, 2.75f, 18.1256f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(14.8993f, 13.9612f)
                curveTo(14.4535f, 14.4051f, 14.1216f, 14.735f, 13.8373f, 14.9802f)
                curveTo(13.5517f, 15.2266f, 13.3677f, 15.3391f, 13.2314f, 15.3892f)
                lineTo(13.7493f, 16.797f)
                curveTo(14.1379f, 16.654f, 14.4841f, 16.4032f, 14.817f, 16.1161f)
                curveTo(15.1512f, 15.8279f, 15.5259f, 15.4541f, 15.9577f, 15.0241f)
                lineTo(14.8993f, 13.9612f)
                close()
                moveTo(13.2314f, 15.3892f)
                curveTo(13.1612f, 15.415f, 13.1007f, 15.4252f, 13.0389f, 15.4252f)
                verticalLineTo(16.9252f)
                curveTo(13.2864f, 16.9252f, 13.5218f, 16.8806f, 13.7493f, 16.797f)
                lineTo(13.2314f, 15.3892f)
                close()
                moveTo(8.9253f, 8.0123f)
                curveTo(8.5038f, 8.432f, 8.1364f, 8.7973f, 7.8506f, 9.1231f)
                curveTo(7.5662f, 9.4473f, 7.3164f, 9.7825f, 7.1665f, 10.1551f)
                lineTo(8.5579f, 10.7153f)
                curveTo(8.6135f, 10.5773f, 8.7318f, 10.3931f, 8.9782f, 10.1123f)
                curveTo(9.2232f, 9.8331f, 9.5492f, 9.5079f, 9.9837f, 9.0752f)
                lineTo(8.9253f, 8.0123f)
                close()
                moveTo(7.1665f, 10.1551f)
                curveTo(7.0682f, 10.3991f, 7.0148f, 10.6534f, 7.0148f, 10.9233f)
                horizontalLineTo(8.5148f)
                curveTo(8.5148f, 10.8585f, 8.5263f, 10.7938f, 8.5579f, 10.7153f)
                lineTo(7.1665f, 10.1551f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.7089f, 10.282f)
                lineTo(8.2389f, 9.7513f)
                lineTo(8.2381f, 9.7505f)
                lineTo(7.7089f, 10.282f)
                close()
                moveTo(11.4377f, 6.7942f)
                curveTo(11.7861f, 7.0181f, 12.2501f, 6.9173f, 12.4741f, 6.5688f)
                curveTo(12.6981f, 6.2204f, 12.5972f, 5.7564f, 12.2488f, 5.5324f)
                lineTo(11.4377f, 6.7942f)
                close()
                moveTo(11.2958f, 5.8114f)
                lineTo(10.8902f, 6.4423f)
                lineTo(10.8902f, 6.4423f)
                lineTo(11.2958f, 5.8114f)
                close()
                moveTo(9.0602f, 4.6657f)
                lineTo(9.1698f, 3.9237f)
                lineTo(9.1698f, 3.9237f)
                lineTo(9.0602f, 4.6657f)
                close()
                moveTo(4.796f, 7.2338f)
                lineTo(5.3252f, 7.7652f)
                lineTo(5.3252f, 7.7652f)
                lineTo(4.796f, 7.2338f)
                close()
                moveTo(7.5054f, 4.8642f)
                lineTo(7.7925f, 5.557f)
                lineTo(7.7925f, 5.557f)
                lineTo(7.5054f, 4.8642f)
                close()
                moveTo(5.351f, 8.4527f)
                lineTo(5.627f, 7.7553f)
                lineTo(5.627f, 7.7553f)
                lineTo(5.351f, 8.4527f)
                close()
                moveTo(5.4582f, 8.4955f)
                lineTo(5.1728f, 9.1891f)
                lineTo(5.4582f, 8.4955f)
                close()
                moveTo(6.873f, 9.4497f)
                lineTo(7.4022f, 8.9182f)
                lineTo(7.4022f, 8.9182f)
                lineTo(6.873f, 9.4497f)
                close()
                moveTo(6.7911f, 9.3686f)
                lineTo(6.2691f, 9.9072f)
                lineTo(6.7911f, 9.3686f)
                close()
                moveTo(5.0216f, 8.3223f)
                lineTo(4.7456f, 9.0197f)
                lineTo(4.7456f, 9.0197f)
                lineTo(5.0216f, 8.3223f)
                close()
                moveTo(13.735f, 16.3374f)
                lineTo(13.205f, 16.868f)
                curveTo(13.2166f, 16.8796f, 13.2286f, 16.8908f, 13.2409f, 16.9016f)
                lineTo(13.735f, 16.3374f)
                close()
                moveTo(18.4484f, 11.7059f)
                curveTo(18.223f, 11.3584f, 17.7586f, 11.2593f, 17.4111f, 11.4846f)
                curveTo(17.0635f, 11.7099f, 16.9644f, 12.1743f, 17.1897f, 12.5219f)
                lineTo(18.4484f, 11.7059f)
                close()
                moveTo(18.1724f, 12.659f)
                lineTo(17.5431f, 13.067f)
                lineTo(17.5431f, 13.067f)
                lineTo(18.1724f, 12.659f)
                close()
                moveTo(19.323f, 14.8852f)
                lineTo(20.0648f, 14.7748f)
                lineTo(19.323f, 14.8852f)
                close()
                moveTo(16.744f, 19.1315f)
                lineTo(17.2732f, 19.6629f)
                lineTo(17.2732f, 19.6629f)
                lineTo(16.744f, 19.1315f)
                close()
                moveTo(19.1237f, 16.4335f)
                lineTo(19.8157f, 16.7227f)
                lineTo(19.1237f, 16.4335f)
                close()
                moveTo(15.6917f, 19.0091f)
                lineTo(16.3882f, 18.7311f)
                lineTo(16.3882f, 18.7311f)
                lineTo(15.6917f, 19.0091f)
                close()
                moveTo(15.2791f, 18.0603f)
                lineTo(14.6217f, 18.4213f)
                lineTo(15.2791f, 18.0603f)
                close()
                moveTo(14.1899f, 16.7358f)
                lineTo(14.7191f, 16.2043f)
                lineTo(14.7021f, 16.1873f)
                lineTo(14.684f, 16.1715f)
                lineTo(14.1899f, 16.7358f)
                close()
                moveTo(14.9015f, 17.4886f)
                lineTo(15.4915f, 17.0257f)
                lineTo(15.4915f, 17.0257f)
                lineTo(14.9015f, 17.4886f)
                close()
                moveTo(16.6709f, 19.2043f)
                lineTo(16.1417f, 18.6728f)
                lineTo(16.1417f, 18.6729f)
                lineTo(16.6709f, 19.2043f)
                close()
                moveTo(14.0204f, 15.5624f)
                curveTo(13.7273f, 15.2697f, 13.2524f, 15.27f, 12.9597f, 15.563f)
                curveTo(12.667f, 15.8561f, 12.6673f, 16.331f, 12.9604f, 16.6237f)
                lineTo(14.0204f, 15.5624f)
                close()
                moveTo(7.3322f, 10.9658f)
                curveTo(7.6252f, 11.2585f, 8.1001f, 11.2582f, 8.3928f, 10.9651f)
                curveTo(8.6856f, 10.6721f, 8.6853f, 10.1972f, 8.3922f, 9.9045f)
                lineTo(7.3322f, 10.9658f)
                close()
                moveTo(12.2488f, 5.5324f)
                lineTo(11.7014f, 5.1805f)
                lineTo(10.8902f, 6.4423f)
                lineTo(11.4377f, 6.7942f)
                lineTo(12.2488f, 5.5324f)
                close()
                moveTo(11.7014f, 5.1805f)
                curveTo(11.162f, 4.8338f, 10.722f, 4.5503f, 10.3423f, 4.346f)
                curveTo(9.9532f, 4.1365f, 9.5826f, 3.9846f, 9.1698f, 3.9237f)
                lineTo(8.9507f, 5.4076f)
                curveTo(9.1263f, 5.4335f, 9.3244f, 5.5016f, 9.6314f, 5.6668f)
                curveTo(9.9479f, 5.8372f, 10.3315f, 6.0831f, 10.8902f, 6.4423f)
                lineTo(11.7014f, 5.1805f)
                close()
                moveTo(5.3252f, 7.7652f)
                curveTo(5.8154f, 7.2771f, 6.3392f, 6.7557f, 6.8095f, 6.3272f)
                curveTo(7.0444f, 6.1131f, 7.2571f, 5.9305f, 7.4383f, 5.791f)
                curveTo(7.6312f, 5.6425f, 7.7462f, 5.5762f, 7.7925f, 5.557f)
                lineTo(7.2182f, 4.1713f)
                curveTo(6.9821f, 4.2691f, 6.7391f, 4.4362f, 6.5233f, 4.6024f)
                curveTo(6.2959f, 4.7774f, 6.0492f, 4.9906f, 5.7992f, 5.2184f)
                curveTo(5.2997f, 5.6736f, 4.7511f, 6.22f, 4.2668f, 6.7023f)
                lineTo(5.3252f, 7.7652f)
                close()
                moveTo(9.1698f, 3.9237f)
                curveTo(8.5128f, 3.8268f, 7.8379f, 3.9145f, 7.2182f, 4.1713f)
                lineTo(7.7925f, 5.557f)
                curveTo(8.1688f, 5.4011f, 8.57f, 5.3514f, 8.9507f, 5.4076f)
                lineTo(9.1698f, 3.9237f)
                close()
                moveTo(4.7456f, 9.0197f)
                lineTo(5.075f, 9.1501f)
                lineTo(5.627f, 7.7553f)
                lineTo(5.2976f, 7.625f)
                lineTo(4.7456f, 9.0197f)
                close()
                moveTo(6.3438f, 9.9811f)
                lineTo(7.1796f, 10.8134f)
                lineTo(8.2381f, 9.7505f)
                lineTo(7.4022f, 8.9182f)
                lineTo(6.3438f, 9.9811f)
                close()
                moveTo(5.075f, 9.1501f)
                curveTo(5.1306f, 9.1721f, 5.1521f, 9.1806f, 5.1728f, 9.1891f)
                lineTo(5.7436f, 7.802f)
                curveTo(5.7114f, 7.7887f, 5.679f, 7.7759f, 5.627f, 7.7553f)
                lineTo(5.075f, 9.1501f)
                close()
                moveTo(7.4022f, 8.9182f)
                curveTo(7.3627f, 8.8788f, 7.3381f, 8.8543f, 7.313f, 8.83f)
                lineTo(6.2691f, 9.9072f)
                curveTo(6.2852f, 9.9228f, 6.3015f, 9.939f, 6.3438f, 9.9811f)
                lineTo(7.4022f, 8.9182f)
                close()
                moveTo(5.1728f, 9.1891f)
                curveTo(5.5809f, 9.357f, 5.953f, 9.6008f, 6.2691f, 9.9072f)
                lineTo(7.313f, 8.83f)
                curveTo(6.8601f, 8.3911f, 6.3274f, 8.0422f, 5.7436f, 7.802f)
                lineTo(5.1728f, 9.1891f)
                close()
                moveTo(4.2668f, 6.7023f)
                curveTo(3.5428f, 7.4232f, 3.7989f, 8.645f, 4.7456f, 9.0197f)
                lineTo(5.2976f, 7.625f)
                curveTo(5.3517f, 7.6464f, 5.37f, 7.7206f, 5.3252f, 7.7652f)
                lineTo(4.2668f, 6.7023f)
                close()
                moveTo(17.1897f, 12.5219f)
                lineTo(17.5431f, 13.067f)
                lineTo(18.8017f, 12.2511f)
                lineTo(18.4484f, 11.7059f)
                lineTo(17.1897f, 12.5219f)
                close()
                moveTo(16.2148f, 18.6f)
                lineTo(16.1417f, 18.6728f)
                lineTo(17.2001f, 19.7357f)
                lineTo(17.2732f, 19.6629f)
                lineTo(16.2148f, 18.6f)
                close()
                moveTo(17.5431f, 13.067f)
                curveTo(17.9038f, 13.6235f, 18.1507f, 14.0053f, 18.3217f, 14.3202f)
                curveTo(18.4875f, 14.6258f, 18.5553f, 14.8222f, 18.5811f, 14.9956f)
                lineTo(20.0648f, 14.7748f)
                curveTo(20.0034f, 14.3623f, 19.8504f, 13.9923f, 19.64f, 13.6047f)
                curveTo(19.4347f, 13.2264f, 19.1499f, 12.7881f, 18.8017f, 12.2511f)
                lineTo(17.5431f, 13.067f)
                close()
                moveTo(17.2732f, 19.6629f)
                curveTo(17.7576f, 19.1806f, 18.3063f, 18.6344f, 18.7634f, 18.1369f)
                curveTo(18.9922f, 17.888f, 19.2063f, 17.6423f, 19.3822f, 17.4158f)
                curveTo(19.5489f, 17.2009f, 19.7171f, 16.9586f, 19.8157f, 16.7227f)
                lineTo(18.4317f, 16.1443f)
                curveTo(18.4127f, 16.1896f, 18.3465f, 16.3038f, 18.1973f, 16.4959f)
                curveTo(18.0572f, 16.6764f, 17.8739f, 16.888f, 17.6589f, 17.122f)
                curveTo(17.2286f, 17.5903f, 16.705f, 18.1119f, 16.2148f, 18.6f)
                lineTo(17.2732f, 19.6629f)
                close()
                moveTo(18.5811f, 14.9956f)
                curveTo(18.6373f, 15.373f, 18.5878f, 15.7707f, 18.4317f, 16.1443f)
                lineTo(19.8157f, 16.7227f)
                curveTo(20.074f, 16.1044f, 20.1624f, 15.4308f, 20.0648f, 14.7748f)
                lineTo(18.5811f, 14.9956f)
                close()
                moveTo(14.684f, 16.1715f)
                lineTo(14.2291f, 15.7732f)
                lineTo(13.2409f, 16.9016f)
                lineTo(13.6958f, 17.3f)
                lineTo(14.684f, 16.1715f)
                close()
                moveTo(16.3882f, 18.7311f)
                curveTo(16.2023f, 18.2652f, 16.0876f, 17.9744f, 15.9365f, 17.6993f)
                lineTo(14.6217f, 18.4213f)
                curveTo(14.7185f, 18.5975f, 14.7962f, 18.7887f, 14.9951f, 19.2871f)
                lineTo(16.3882f, 18.7311f)
                close()
                moveTo(13.6607f, 17.2672f)
                curveTo(14.0415f, 17.6464f, 14.1872f, 17.7933f, 14.3115f, 17.9516f)
                lineTo(15.4915f, 17.0257f)
                curveTo(15.2977f, 16.7787f, 15.0751f, 16.5588f, 14.7191f, 16.2043f)
                lineTo(13.6607f, 17.2672f)
                close()
                moveTo(15.9365f, 17.6993f)
                curveTo(15.8068f, 17.4631f, 15.658f, 17.2378f, 15.4915f, 17.0257f)
                lineTo(14.3115f, 17.9516f)
                curveTo(14.4275f, 18.0996f, 14.5313f, 18.2567f, 14.6217f, 18.4213f)
                lineTo(15.9365f, 17.6993f)
                close()
                moveTo(16.1417f, 18.6729f)
                curveTo(16.182f, 18.6327f, 16.236f, 18.6237f, 16.2733f, 18.6312f)
                curveTo(16.311f, 18.6387f, 16.3638f, 18.6699f, 16.3882f, 18.7311f)
                lineTo(14.9951f, 19.2871f)
                curveTo(15.3559f, 20.1912f, 16.5258f, 20.4072f, 17.2001f, 19.7357f)
                lineTo(16.1417f, 18.6729f)
                close()
                moveTo(14.265f, 15.8067f)
                lineTo(14.0204f, 15.5624f)
                lineTo(12.9604f, 16.6237f)
                lineTo(13.205f, 16.868f)
                lineTo(14.265f, 15.8067f)
                close()
                moveTo(7.1789f, 10.8126f)
                lineTo(7.3322f, 10.9658f)
                lineTo(8.3922f, 9.9045f)
                lineTo(8.2389f, 9.7513f)
                lineTo(7.1789f, 10.8126f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5482f, 13.0f)
                lineTo(3.8565f, 14.6897f)
                curveTo(3.4318f, 15.1139f, 2.7432f, 15.1139f, 2.3185f, 14.6897f)
                curveTo(1.8938f, 14.2655f, 1.8938f, 13.5778f, 2.3185f, 13.1536f)
                lineTo(2.4723f, 13.0f)
                moveTo(11.0757f, 18.5696f)
                lineTo(9.384f, 20.2593f)
                curveTo(8.9593f, 20.6835f, 8.9593f, 21.3712f, 9.384f, 21.7954f)
                curveTo(9.8086f, 22.2195f, 10.4972f, 22.2195f, 10.9219f, 21.7954f)
                lineTo(11.0757f, 21.6418f)
                moveTo(6.936f, 17.1588f)
                lineTo(5.2264f, 18.8308f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.6329f, 17.186f)
                curveTo(10.9258f, 16.8931f, 10.9258f, 16.4182f, 10.6329f, 16.1253f)
                curveTo(10.34f, 15.8324f, 9.8651f, 15.8324f, 9.5722f, 16.1253f)
                lineTo(10.6329f, 17.186f)
                close()
                moveTo(7.4698f, 18.2277f)
                curveTo(7.1769f, 18.5206f, 7.1769f, 18.9955f, 7.4698f, 19.2884f)
                curveTo(7.7627f, 19.5813f, 8.2376f, 19.5813f, 8.5305f, 19.2884f)
                lineTo(7.4698f, 18.2277f)
                close()
                moveTo(7.8572f, 14.4136f)
                curveTo(8.1501f, 14.1207f, 8.1501f, 13.6459f, 7.8572f, 13.353f)
                curveTo(7.5643f, 13.0601f, 7.0894f, 13.0601f, 6.7965f, 13.353f)
                lineTo(7.8572f, 14.4136f)
                close()
                moveTo(4.6796f, 15.4699f)
                curveTo(4.3867f, 15.7628f, 4.3867f, 16.2376f, 4.6796f, 16.5305f)
                curveTo(4.9725f, 16.8234f, 5.4474f, 16.8234f, 5.7403f, 16.5305f)
                lineTo(4.6796f, 15.4699f)
                close()
                moveTo(9.5722f, 16.1253f)
                lineTo(7.4698f, 18.2277f)
                lineTo(8.5305f, 19.2884f)
                lineTo(10.6329f, 17.186f)
                lineTo(9.5722f, 16.1253f)
                close()
                moveTo(6.7965f, 13.353f)
                lineTo(4.6796f, 15.4699f)
                lineTo(5.7403f, 16.5305f)
                lineTo(7.8572f, 14.4136f)
                lineTo(6.7965f, 13.353f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.3732f, 12.6445f)
                curveTo(12.6667f, 12.3523f, 12.6677f, 11.8774f, 12.3754f, 11.5839f)
                curveTo(12.0831f, 11.2904f, 11.6083f, 11.2894f, 11.3148f, 11.5816f)
                lineTo(12.3732f, 12.6445f)
                close()
                moveTo(10.581f, 14.4292f)
                lineTo(12.3732f, 12.6445f)
                lineTo(11.3148f, 11.5816f)
                lineTo(9.5225f, 13.3663f)
                lineTo(10.581f, 14.4292f)
                close()
                moveTo(17.2888f, 8.0123f)
                curveTo(16.9216f, 8.378f, 16.3248f, 8.378f, 15.9576f, 8.0123f)
                lineTo(14.8992f, 9.0752f)
                curveTo(15.8517f, 10.0237f, 17.3947f, 10.0237f, 18.3472f, 9.0752f)
                lineTo(17.2888f, 8.0123f)
                close()
                moveTo(15.9576f, 8.0123f)
                curveTo(15.5921f, 7.6484f, 15.5921f, 7.0596f, 15.9576f, 6.6957f)
                lineTo(14.8992f, 5.6328f)
                curveTo(13.9449f, 6.583f, 13.9449f, 8.125f, 14.8992f, 9.0752f)
                lineTo(15.9576f, 8.0123f)
                close()
                moveTo(15.9576f, 6.6957f)
                curveTo(16.3248f, 6.33f, 16.9216f, 6.33f, 17.2888f, 6.6957f)
                lineTo(18.3472f, 5.6328f)
                curveTo(17.3947f, 4.6843f, 15.8517f, 4.6843f, 14.8992f, 5.6328f)
                lineTo(15.9576f, 6.6957f)
                close()
                moveTo(17.2888f, 6.6957f)
                curveTo(17.6543f, 7.0596f, 17.6543f, 7.6484f, 17.2888f, 8.0123f)
                lineTo(18.3472f, 9.0752f)
                curveTo(19.3015f, 8.125f, 19.3015f, 6.583f, 18.3472f, 5.6328f)
                lineTo(17.2888f, 6.6957f)
                close()
            }
        }
            .build()
        return _rocket2!!
    }

private var _rocket2: ImageVector? = null
