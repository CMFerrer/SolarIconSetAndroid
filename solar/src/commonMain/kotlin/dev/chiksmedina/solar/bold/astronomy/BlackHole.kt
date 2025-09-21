package dev.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.BlackHole: ImageVector
    get() {
        if (_blackHole != null) {
            return _blackHole!!
        }
        _blackHole = Builder(
            name = "BlackHole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.6755f, 11.9463f)
                curveTo(6.9311f, 12.2722f, 7.4026f, 12.3293f, 7.7285f, 12.0737f)
                curveTo(8.0545f, 11.8182f, 8.1116f, 11.3467f, 7.856f, 11.0208f)
                curveTo(7.4554f, 10.5099f, 7.1101f, 9.9425f, 6.8465f, 9.3437f)
                curveTo(6.6796f, 8.9646f, 6.237f, 8.7926f, 5.8579f, 8.9594f)
                curveTo(5.4788f, 9.1263f, 5.3068f, 9.5689f, 5.4737f, 9.9481f)
                curveTo(5.7903f, 10.6674f, 6.2018f, 11.342f, 6.6755f, 11.9463f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.8395f, 7.6717f)
                curveTo(4.8885f, 8.083f, 5.2616f, 8.3767f, 5.6729f, 8.3277f)
                curveTo(6.0842f, 8.2787f, 6.3779f, 7.9055f, 6.3289f, 7.4942f)
                curveTo(6.2544f, 6.8694f, 6.284f, 6.2425f, 6.4377f, 5.6322f)
                curveTo(6.5389f, 5.2305f, 6.2953f, 4.8229f, 5.8936f, 4.7218f)
                curveTo(5.4919f, 4.6206f, 5.0843f, 4.8642f, 4.9831f, 5.2659f)
                curveTo(4.7806f, 6.0702f, 4.7454f, 6.8826f, 4.8395f, 7.6717f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0075f, 3.0793f)
                curveTo(5.7657f, 3.4157f, 5.8424f, 3.8843f, 6.1787f, 4.1261f)
                curveTo(6.5151f, 4.3679f, 6.9837f, 4.2912f, 7.2255f, 3.9549f)
                curveTo(7.4025f, 3.7087f, 7.6084f, 3.4656f, 7.8463f, 3.2277f)
                curveTo(8.1392f, 2.9348f, 8.1392f, 2.4599f, 7.8463f, 2.167f)
                curveTo(7.5534f, 1.8741f, 7.0785f, 1.8741f, 6.7857f, 2.167f)
                curveTo(6.4924f, 2.4603f, 6.2335f, 2.765f, 6.0075f, 3.0793f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.636f, 12.0537f)
                curveTo(17.3804f, 11.7278f, 16.909f, 11.6707f, 16.583f, 11.9263f)
                curveTo(16.257f, 12.1818f, 16.2f, 12.6533f, 16.4555f, 12.9792f)
                curveTo(16.8561f, 13.4901f, 17.2014f, 14.0575f, 17.465f, 14.6563f)
                curveTo(17.6319f, 15.0354f, 18.0745f, 15.2074f, 18.4536f, 15.0405f)
                curveTo(18.8327f, 14.8737f, 19.0047f, 14.431f, 18.8378f, 14.0519f)
                curveTo(18.5212f, 13.3326f, 18.1097f, 12.658f, 17.636f, 12.0537f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.4721f, 16.3283f)
                curveTo(19.423f, 15.917f, 19.0499f, 15.6233f, 18.6386f, 15.6723f)
                curveTo(18.2273f, 15.7213f, 17.9336f, 16.0945f, 17.9826f, 16.5058f)
                curveTo(18.0571f, 17.1306f, 18.0275f, 17.7575f, 17.8738f, 18.3678f)
                curveTo(17.7726f, 18.7695f, 18.0163f, 19.1771f, 18.4179f, 19.2782f)
                curveTo(18.8196f, 19.3794f, 19.2272f, 19.1358f, 19.3284f, 18.7341f)
                curveTo(19.5309f, 17.9298f, 19.5661f, 17.1174f, 19.4721f, 16.3283f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.304f, 20.9207f)
                curveTo(18.5458f, 20.5843f, 18.4691f, 20.1157f, 18.1328f, 19.8739f)
                curveTo(17.7965f, 19.6321f, 17.3278f, 19.7088f, 17.0861f, 20.0451f)
                curveTo(16.9091f, 20.2913f, 16.7031f, 20.5344f, 16.4652f, 20.7723f)
                curveTo(16.1723f, 21.0652f, 16.1723f, 21.5401f, 16.4652f, 21.833f)
                curveTo(16.7581f, 22.1259f, 17.233f, 22.1259f, 17.5259f, 21.833f)
                curveTo(17.8191f, 21.5397f, 18.0781f, 21.235f, 18.304f, 20.9207f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0815f, 7.5728f)
                curveTo(11.826f, 7.2468f, 11.883f, 6.7754f, 12.209f, 6.5198f)
                curveTo(12.8133f, 6.046f, 13.4879f, 5.6346f, 14.2072f, 5.3179f)
                curveTo(14.5863f, 5.151f, 15.0289f, 5.3231f, 15.1958f, 5.7022f)
                curveTo(15.3627f, 6.0813f, 15.1907f, 6.5239f, 14.8116f, 6.6908f)
                curveTo(14.2128f, 6.9544f, 13.6454f, 7.2997f, 13.1345f, 7.7002f)
                curveTo(12.8085f, 7.9558f, 12.3371f, 7.8987f, 12.0815f, 7.5728f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.8276f, 5.5172f)
                curveTo(15.7786f, 5.1059f, 16.0723f, 4.7327f, 16.4836f, 4.6837f)
                curveTo(17.2727f, 4.5897f, 18.0851f, 4.6248f, 18.8894f, 4.8274f)
                curveTo(19.291f, 4.9285f, 19.5347f, 5.3362f, 19.4335f, 5.7378f)
                curveTo(19.3324f, 6.1395f, 18.9247f, 6.3831f, 18.5231f, 6.282f)
                curveTo(17.9128f, 6.1283f, 17.2859f, 6.0987f, 16.6611f, 6.1732f)
                curveTo(16.2498f, 6.2222f, 15.8766f, 5.9285f, 15.8276f, 5.5172f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0292f, 6.023f)
                curveTo(20.271f, 5.6866f, 20.7396f, 5.61f, 21.0759f, 5.8517f)
                curveTo(21.3903f, 6.0777f, 21.695f, 6.3366f, 21.9883f, 6.6299f)
                curveTo(22.2812f, 6.9228f, 22.2812f, 7.3977f, 21.9883f, 7.6906f)
                curveTo(21.6954f, 7.9834f, 21.2205f, 7.9834f, 20.9276f, 7.6906f)
                curveTo(20.6897f, 7.4526f, 20.4466f, 7.2467f, 20.2004f, 7.0697f)
                curveTo(19.8641f, 6.8279f, 19.7874f, 6.3593f, 20.0292f, 6.023f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.1025f, 17.4802f)
                curveTo(12.4285f, 17.2246f, 12.4856f, 16.7532f, 12.23f, 16.4272f)
                curveTo(11.9744f, 16.1013f, 11.503f, 16.0442f, 11.177f, 16.2998f)
                curveTo(10.6661f, 16.7003f, 10.0987f, 17.0456f, 9.5f, 17.3092f)
                curveTo(9.1208f, 17.4761f, 8.9488f, 17.9187f, 9.1157f, 18.2978f)
                curveTo(9.2826f, 18.6769f, 9.7252f, 18.849f, 10.1043f, 18.6821f)
                curveTo(10.8237f, 18.3654f, 11.4983f, 17.954f, 12.1025f, 17.4802f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.828f, 19.3163f)
                curveTo(8.2393f, 19.2673f, 8.5329f, 18.8941f, 8.4839f, 18.4828f)
                curveTo(8.4349f, 18.0715f, 8.0617f, 17.7778f, 7.6504f, 17.8268f)
                curveTo(7.0257f, 17.9013f, 6.3988f, 17.8717f, 5.7884f, 17.718f)
                curveTo(5.3868f, 17.6169f, 4.9792f, 17.8605f, 4.878f, 18.2622f)
                curveTo(4.7769f, 18.6639f, 5.0205f, 19.0715f, 5.4222f, 19.1726f)
                curveTo(6.2265f, 19.3752f, 7.0388f, 19.4103f, 7.828f, 19.3163f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.2356f, 18.1483f)
                curveTo(3.5719f, 18.39f, 4.0406f, 18.3134f, 4.2823f, 17.977f)
                curveTo(4.5241f, 17.6407f, 4.4475f, 17.1721f, 4.1111f, 16.9303f)
                curveTo(3.8649f, 16.7533f, 3.6218f, 16.5474f, 3.3839f, 16.3094f)
                curveTo(3.091f, 16.0165f, 2.6161f, 16.0165f, 2.3233f, 16.3094f)
                curveTo(2.0304f, 16.6023f, 2.0304f, 17.0772f, 2.3233f, 17.3701f)
                curveTo(2.6165f, 17.6634f, 2.9212f, 17.9223f, 3.2356f, 18.1483f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.7462f, 15.8171f)
                curveTo(13.4968f, 16.1478f, 13.0265f, 16.2137f, 12.6958f, 15.9643f)
                curveTo(12.5132f, 15.8266f, 12.4114f, 15.6216f, 12.3987f, 15.4099f)
                curveTo(11.1182f, 16.0153f, 9.4846f, 16.1928f, 7.8948f, 15.9676f)
                curveTo(4.6859f, 15.513f, 1.25f, 13.3158f, 1.25f, 9.0f)
                curveTo(1.25f, 8.5858f, 1.5858f, 8.25f, 2.0f, 8.25f)
                curveTo(2.4142f, 8.25f, 2.75f, 8.5858f, 2.75f, 9.0f)
                curveTo(2.75f, 12.2842f, 5.3141f, 14.087f, 8.1052f, 14.4824f)
                curveTo(8.75f, 14.5738f, 9.3852f, 14.5845f, 9.9769f, 14.5229f)
                curveTo(9.4083f, 14.3f, 8.8552f, 13.9795f, 8.3387f, 13.59f)
                curveTo(8.008f, 13.3405f, 7.9421f, 12.8703f, 8.1915f, 12.5396f)
                curveTo(8.3475f, 12.3327f, 8.5899f, 12.2294f, 8.8305f, 12.2422f)
                curveTo(8.2826f, 10.9866f, 8.1278f, 9.4206f, 8.3439f, 7.8948f)
                curveTo(8.7985f, 4.6859f, 10.9957f, 1.25f, 15.3115f, 1.25f)
                curveTo(15.7257f, 1.25f, 16.0615f, 1.5858f, 16.0615f, 2.0f)
                curveTo(16.0615f, 2.4142f, 15.7257f, 2.75f, 15.3115f, 2.75f)
                curveTo(12.0274f, 2.75f, 10.2245f, 5.3141f, 9.8291f, 8.1052f)
                curveTo(9.7604f, 8.5899f, 9.7373f, 9.0691f, 9.7562f, 9.5285f)
                curveTo(9.9679f, 9.0629f, 10.2429f, 8.6104f, 10.5653f, 8.1829f)
                curveTo(10.8147f, 7.8522f, 11.285f, 7.7863f, 11.6157f, 8.0357f)
                curveTo(11.8499f, 8.2123f, 11.9513f, 8.4997f, 11.902f, 8.7699f)
                curveTo(13.1321f, 8.2713f, 14.6373f, 8.136f, 16.1052f, 8.3439f)
                curveTo(19.3141f, 8.7985f, 22.75f, 10.9957f, 22.75f, 15.3115f)
                curveTo(22.75f, 15.7257f, 22.4142f, 16.0615f, 22.0f, 16.0615f)
                curveTo(21.5858f, 16.0615f, 21.25f, 15.7257f, 21.25f, 15.3115f)
                curveTo(21.25f, 12.0274f, 18.6858f, 10.2245f, 15.8948f, 9.8291f)
                curveTo(15.5713f, 9.7833f, 15.2503f, 9.7577f, 14.936f, 9.7514f)
                curveTo(15.293f, 9.9373f, 15.6405f, 10.1594f, 15.9729f, 10.41f)
                curveTo(16.3036f, 10.6595f, 16.3695f, 11.1297f, 16.1201f, 11.4604f)
                curveTo(15.9641f, 11.6673f, 15.7216f, 11.7705f, 15.481f, 11.7578f)
                curveTo(16.029f, 13.0134f, 16.1837f, 14.5794f, 15.9676f, 16.1052f)
                curveTo(15.513f, 19.3142f, 13.3158f, 22.75f, 9.0f, 22.75f)
                curveTo(8.5858f, 22.75f, 8.25f, 22.4142f, 8.25f, 22.0f)
                curveTo(8.25f, 21.5858f, 8.5858f, 21.25f, 9.0f, 21.25f)
                curveTo(12.2842f, 21.25f, 14.087f, 18.6858f, 14.4824f, 15.8948f)
                curveTo(14.5511f, 15.4101f, 14.5742f, 14.9309f, 14.5553f, 14.4715f)
                curveTo(14.3437f, 14.9371f, 14.0686f, 15.3896f, 13.7462f, 15.8171f)
                close()
            }
        }
            .build()
        return _blackHole!!
    }

private var _blackHole: ImageVector? = null
