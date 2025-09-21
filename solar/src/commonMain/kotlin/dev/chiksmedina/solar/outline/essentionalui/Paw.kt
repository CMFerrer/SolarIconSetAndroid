package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Paw: ImageVector
    get() {
        if (_paw != null) {
            return _paw!!
        }
        _paw = Builder(
            name = "Paw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.2961f, 1.9906f)
                curveTo(9.889f, 2.5435f, 10.3472f, 3.3577f, 10.5824f, 4.2889f)
                curveTo(10.8177f, 5.2208f, 10.8026f, 6.1621f, 10.5537f, 6.9428f)
                curveTo(10.3089f, 7.7105f, 9.7921f, 8.435f, 8.9508f, 8.6742f)
                curveTo(8.0999f, 8.9161f, 7.2909f, 8.5567f, 6.7039f, 8.0094f)
                curveTo(6.111f, 7.4565f, 5.6528f, 6.6423f, 5.4176f, 5.7111f)
                curveTo(5.1823f, 4.7792f, 5.1974f, 3.8379f, 5.4463f, 3.0573f)
                curveTo(5.6911f, 2.2895f, 6.2079f, 1.565f, 7.0492f, 1.3259f)
                curveTo(7.9001f, 1.0839f, 8.7091f, 1.4433f, 9.2961f, 1.9906f)
                close()
                moveTo(8.2731f, 3.0877f)
                curveTo(7.9187f, 2.7572f, 7.6332f, 2.7193f, 7.4594f, 2.7687f)
                curveTo(7.2761f, 2.8208f, 7.0323f, 3.021f, 6.8755f, 3.5129f)
                curveTo(6.7228f, 3.9918f, 6.6955f, 4.645f, 6.8719f, 5.3438f)
                curveTo(7.0486f, 6.0434f, 7.3785f, 6.5875f, 7.7269f, 6.9124f)
                curveTo(8.0813f, 7.2428f, 8.3668f, 7.2807f, 8.5406f, 7.2313f)
                curveTo(8.7239f, 7.1792f, 8.9677f, 6.979f, 9.1245f, 6.4871f)
                curveTo(9.2772f, 6.0082f, 9.3045f, 5.355f, 9.128f, 4.6562f)
                curveTo(8.9514f, 3.9566f, 8.6215f, 3.4126f, 8.2731f, 3.0877f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.8509f, 9.4386f)
                curveTo(11.5969f, 9.1872f, 12.4031f, 9.1872f, 13.1491f, 9.4386f)
                curveTo(13.9775f, 9.7178f, 14.579f, 10.4109f, 15.1373f, 11.2965f)
                curveTo(15.6976f, 12.1854f, 16.3064f, 13.4249f, 17.0814f, 15.0026f)
                lineTo(17.9884f, 16.8492f)
                curveTo(18.1872f, 17.2538f, 18.346f, 17.5771f, 18.4603f, 17.8343f)
                curveTo(18.5725f, 18.0866f, 18.6694f, 18.334f, 18.7104f, 18.5741f)
                curveTo(18.9857f, 20.1872f, 17.7927f, 21.7014f, 16.1473f, 21.7493f)
                curveTo(15.9028f, 21.7564f, 15.6417f, 21.7081f, 15.3763f, 21.6465f)
                curveTo(15.1054f, 21.5836f, 14.762f, 21.4895f, 14.3333f, 21.372f)
                lineTo(14.3173f, 21.3676f)
                curveTo(13.8025f, 21.2265f, 13.578f, 21.1654f, 13.3559f, 21.1205f)
                curveTo(12.4607f, 20.9393f, 11.5393f, 20.9393f, 10.6441f, 21.1205f)
                curveTo(10.422f, 21.1654f, 10.1976f, 21.2265f, 9.6827f, 21.3676f)
                lineTo(9.6667f, 21.372f)
                curveTo(9.2383f, 21.4894f, 8.8946f, 21.5836f, 8.6237f, 21.6465f)
                curveTo(8.3583f, 21.7081f, 8.0972f, 21.7564f, 7.8528f, 21.7493f)
                curveTo(6.2073f, 21.7014f, 5.0143f, 20.1872f, 5.2897f, 18.5741f)
                curveTo(5.3307f, 18.334f, 5.4275f, 18.0866f, 5.5397f, 17.8343f)
                curveTo(5.654f, 17.5772f, 5.8128f, 17.2538f, 6.0116f, 16.8492f)
                lineTo(6.9186f, 15.0026f)
                curveTo(7.6936f, 13.4249f, 8.3024f, 12.1854f, 8.8628f, 11.2965f)
                curveTo(9.421f, 10.4109f, 10.0225f, 9.7178f, 10.8509f, 9.4386f)
                close()
                moveTo(12.6701f, 10.86f)
                curveTo(12.2348f, 10.7133f, 11.7652f, 10.7133f, 11.33f, 10.86f)
                curveTo(11.0171f, 10.9655f, 10.6516f, 11.2717f, 10.1317f, 12.0964f)
                curveTo(9.619f, 12.9097f, 9.0445f, 14.0769f, 8.2438f, 15.707f)
                lineTo(7.3651f, 17.496f)
                curveTo(7.1575f, 17.9185f, 7.0116f, 18.2159f, 6.9103f, 18.4437f)
                curveTo(6.8056f, 18.6794f, 6.7758f, 18.7826f, 6.7683f, 18.8265f)
                curveTo(6.6412f, 19.5709f, 7.1923f, 20.2294f, 7.8964f, 20.2499f)
                curveTo(7.9352f, 20.2511f, 8.0367f, 20.2429f, 8.2844f, 20.1854f)
                curveTo(8.5231f, 20.13f, 8.8379f, 20.0438f, 9.2862f, 19.921f)
                lineTo(9.3152f, 19.913f)
                curveTo(9.7932f, 19.782f, 10.0688f, 19.7065f, 10.3466f, 19.6503f)
                curveTo(11.4382f, 19.4294f, 12.5619f, 19.4294f, 13.6534f, 19.6503f)
                curveTo(13.9313f, 19.7065f, 14.2068f, 19.782f, 14.6849f, 19.913f)
                lineTo(14.7138f, 19.921f)
                curveTo(15.1621f, 20.0438f, 15.4769f, 20.13f, 15.7156f, 20.1854f)
                curveTo(15.9633f, 20.2429f, 16.0648f, 20.2511f, 16.1036f, 20.2499f)
                curveTo(16.8077f, 20.2294f, 17.3588f, 19.5709f, 17.2318f, 18.8265f)
                curveTo(17.2242f, 18.7826f, 17.1945f, 18.6794f, 17.0897f, 18.4437f)
                curveTo(16.9884f, 18.2159f, 16.8425f, 17.9185f, 16.6349f, 17.496f)
                lineTo(15.7562f, 15.707f)
                curveTo(14.9555f, 14.0769f, 14.3811f, 12.9097f, 13.8683f, 12.0964f)
                curveTo(13.3484f, 11.2717f, 12.9829f, 10.9655f, 12.6701f, 10.86f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.4176f, 4.2889f)
                curveTo(13.6528f, 3.3577f, 14.111f, 2.5435f, 14.7039f, 1.9906f)
                curveTo(15.2909f, 1.4433f, 16.0999f, 1.0839f, 16.9508f, 1.3259f)
                curveTo(17.7921f, 1.565f, 18.3089f, 2.2895f, 18.5537f, 3.0573f)
                curveTo(18.8026f, 3.8379f, 18.8177f, 4.7792f, 18.5824f, 5.7111f)
                curveTo(18.3472f, 6.6423f, 17.889f, 7.4565f, 17.2961f, 8.0094f)
                curveTo(16.7091f, 8.5567f, 15.9001f, 8.9161f, 15.0492f, 8.6742f)
                curveTo(14.2079f, 8.435f, 13.6911f, 7.7105f, 13.4463f, 6.9428f)
                curveTo(13.1974f, 6.1621f, 13.1823f, 5.2208f, 13.4176f, 4.2889f)
                close()
                moveTo(16.5406f, 2.7687f)
                curveTo(16.3668f, 2.7193f, 16.0813f, 2.7572f, 15.7269f, 3.0877f)
                curveTo(15.3785f, 3.4126f, 15.0486f, 3.9566f, 14.872f, 4.6562f)
                curveTo(14.6955f, 5.355f, 14.7228f, 6.0082f, 14.8755f, 6.4871f)
                curveTo(15.0323f, 6.979f, 15.2761f, 7.1792f, 15.4594f, 7.2313f)
                curveTo(15.6332f, 7.2807f, 15.9187f, 7.2428f, 16.2731f, 6.9124f)
                curveTo(16.6215f, 6.5875f, 16.9514f, 6.0434f, 17.1281f, 5.3438f)
                curveTo(17.3045f, 4.645f, 17.2772f, 3.9918f, 17.1245f, 3.5129f)
                curveTo(16.9677f, 3.021f, 16.7239f, 2.8208f, 16.5406f, 2.7687f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.6954f, 9.2035f)
                curveTo(4.1317f, 8.8136f, 3.4026f, 8.6075f, 2.6853f, 8.861f)
                curveTo(1.964f, 9.1158f, 1.5327f, 9.737f, 1.3547f, 10.3994f)
                curveTo(1.1765f, 11.0626f, 1.2265f, 11.8296f, 1.4991f, 12.5595f)
                curveTo(1.7717f, 13.2897f, 2.2377f, 13.9043f, 2.8046f, 14.2965f)
                curveTo(3.3683f, 14.6865f, 4.0974f, 14.8925f, 4.8147f, 14.6391f)
                curveTo(5.536f, 14.3842f, 5.9673f, 13.763f, 6.1453f, 13.1007f)
                curveTo(6.3236f, 12.4375f, 6.2735f, 11.6704f, 6.0009f, 10.9405f)
                curveTo(5.7283f, 10.2103f, 5.2623f, 9.5957f, 4.6954f, 9.2035f)
                close()
                moveTo(3.842f, 10.4371f)
                curveTo(4.1304f, 10.6366f, 4.4184f, 10.9905f, 4.5957f, 11.4653f)
                curveTo(4.7732f, 11.9404f, 4.7839f, 12.3868f, 4.6967f, 12.7113f)
                curveTo(4.6092f, 13.0367f, 4.4487f, 13.1775f, 4.3149f, 13.2248f)
                curveTo(4.1771f, 13.2735f, 3.9496f, 13.2647f, 3.658f, 13.0629f)
                curveTo(3.3696f, 12.8634f, 3.0816f, 12.5096f, 2.9043f, 12.0348f)
                curveTo(2.7268f, 11.5596f, 2.7161f, 11.1132f, 2.8033f, 10.7887f)
                curveTo(2.8908f, 10.4633f, 3.0513f, 10.3225f, 3.1851f, 10.2753f)
                curveTo(3.3229f, 10.2265f, 3.5504f, 10.2354f, 3.842f, 10.4371f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.3147f, 8.861f)
                curveTo(20.5974f, 8.6075f, 19.8683f, 8.8136f, 19.3046f, 9.2035f)
                curveTo(18.7377f, 9.5957f, 18.2717f, 10.2103f, 17.9991f, 10.9405f)
                curveTo(17.7265f, 11.6704f, 17.6764f, 12.4375f, 17.8547f, 13.1007f)
                curveTo(18.0327f, 13.763f, 18.464f, 14.3842f, 19.1853f, 14.6391f)
                curveTo(19.9026f, 14.8925f, 20.6317f, 14.6865f, 21.1954f, 14.2965f)
                curveTo(21.7623f, 13.9043f, 22.2283f, 13.2897f, 22.5009f, 12.5595f)
                curveTo(22.7735f, 11.8296f, 22.8236f, 11.0626f, 22.6453f, 10.3994f)
                curveTo(22.4673f, 9.737f, 22.036f, 9.1158f, 21.3147f, 8.861f)
                close()
                moveTo(19.4043f, 11.4653f)
                curveTo(19.5816f, 10.9905f, 19.8696f, 10.6366f, 20.158f, 10.4371f)
                curveTo(20.4496f, 10.2354f, 20.677f, 10.2265f, 20.8149f, 10.2753f)
                curveTo(20.9487f, 10.3225f, 21.1092f, 10.4633f, 21.1967f, 10.7887f)
                curveTo(21.2839f, 11.1132f, 21.2732f, 11.5596f, 21.0957f, 12.0348f)
                curveTo(20.9184f, 12.5096f, 20.6304f, 12.8634f, 20.342f, 13.0629f)
                curveTo(20.0504f, 13.2647f, 19.823f, 13.2735f, 19.6851f, 13.2248f)
                curveTo(19.5513f, 13.1775f, 19.3908f, 13.0367f, 19.3033f, 12.7113f)
                curveTo(19.2161f, 12.3868f, 19.2268f, 11.9404f, 19.4043f, 11.4653f)
                close()
            }
        }
            .build()
        return _paw!!
    }

private var _paw: ImageVector? = null
