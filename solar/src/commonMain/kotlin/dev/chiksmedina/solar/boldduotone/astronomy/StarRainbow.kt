package dev.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.StarRainbow: ImageVector
    get() {
        if (_starRainbow != null) {
            return _starRainbow!!
        }
        _starRainbow = Builder(
            name = "StarRainbow", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.9456f, 2.8473f)
                curveTo(18.3542f, 2.1498f, 19.0585f, 1.801f, 19.5345f, 2.1177f)
                curveTo(20.0104f, 2.4344f, 19.9427f, 3.2067f, 19.8074f, 4.7514f)
                lineTo(19.7724f, 5.1511f)
                curveTo(19.7339f, 5.59f, 19.7147f, 5.8095f, 19.7834f, 6.0085f)
                curveTo(19.8521f, 6.2074f, 20.0008f, 6.3633f, 20.2984f, 6.6751f)
                lineTo(20.5694f, 6.9589f)
                curveTo(21.6166f, 8.0561f, 22.1402f, 8.6047f, 21.9676f, 9.1668f)
                curveTo(21.795f, 9.7289f, 21.0405f, 9.9322f, 19.5315f, 10.3389f)
                lineTo(19.1411f, 10.4441f)
                curveTo(18.7123f, 10.5597f, 18.4979f, 10.6175f, 18.3269f, 10.7517f)
                curveTo(18.156f, 10.8859f, 18.0478f, 11.0814f, 17.8314f, 11.4723f)
                lineTo(17.6344f, 11.8281f)
                curveTo(16.873f, 13.2038f, 16.4924f, 13.8916f, 15.9098f, 13.9223f)
                curveTo(15.3272f, 13.953f, 14.9285f, 13.3063f, 14.1312f, 12.013f)
                lineTo(13.925f, 11.6784f)
                curveTo(13.6984f, 11.3108f, 13.5851f, 11.1271f, 13.4108f, 11.0111f)
                curveTo(13.2365f, 10.8951f, 13.0208f, 10.86f, 12.5895f, 10.7898f)
                lineTo(12.1968f, 10.7259f)
                curveTo(10.6791f, 10.4789f, 9.9202f, 10.3554f, 9.7327f, 9.8123f)
                curveTo(9.5452f, 9.2692f, 10.0534f, 8.6662f, 11.0696f, 7.4601f)
                lineTo(11.3325f, 7.1481f)
                curveTo(11.6213f, 6.8054f, 11.7657f, 6.634f, 11.8289f, 6.4281f)
                curveTo(11.8921f, 6.2222f, 11.867f, 6.0051f, 11.8168f, 5.5708f)
                lineTo(11.7711f, 5.1754f)
                curveTo(11.5945f, 3.6472f, 11.5062f, 2.883f, 11.9729f, 2.5166f)
                curveTo(12.4396f, 2.1502f, 13.1523f, 2.4242f, 14.5776f, 2.9722f)
                lineTo(14.9464f, 3.114f)
                curveTo(15.3514f, 3.2697f, 15.554f, 3.3476f, 15.7674f, 3.3363f)
                curveTo(15.9808f, 3.3251f, 16.1809f, 3.226f, 16.5812f, 3.0278f)
                lineTo(16.9456f, 2.8473f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0445f, 11.3198f)
                curveTo(5.9905f, 13.2692f, 3.2711f, 16.7962f, 2.0908f, 20.0316f)
                curveTo(1.7078f, 21.0813f, 2.5907f, 22.0001f, 3.7167f, 22.0001f)
                horizontalLineTo(4.75f)
                curveTo(4.7501f, 21.6493f, 4.8322f, 21.2135f, 4.9537f, 20.7559f)
                curveTo(5.0788f, 20.285f, 5.2589f, 19.7425f, 5.4833f, 19.1611f)
                curveTo(5.9322f, 17.9987f, 6.5706f, 16.65f, 7.3362f, 15.3647f)
                curveTo(8.0991f, 14.084f, 9.0062f, 12.8361f, 10.0012f, 11.8987f)
                curveTo(10.0258f, 11.8755f, 10.0506f, 11.8525f, 10.0754f, 11.8296f)
                curveTo(10.052f, 11.8225f, 10.0289f, 11.8152f, 10.0062f, 11.8079f)
                curveTo(9.7219f, 11.7164f, 9.3666f, 11.5709f, 9.0445f, 11.3198f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0202f, 12.2168f)
                curveTo(11.7015f, 12.4118f, 11.3705f, 12.6695f, 11.0298f, 12.9905f)
                curveTo(10.1729f, 13.7978f, 9.3481f, 14.9183f, 8.6249f, 16.1324f)
                curveTo(7.9044f, 17.3418f, 7.3025f, 18.6141f, 6.8826f, 19.7015f)
                curveTo(6.6727f, 20.245f, 6.5114f, 20.7346f, 6.4035f, 21.1409f)
                curveTo(6.2922f, 21.5599f, 6.2501f, 21.8459f, 6.25f, 22.0001f)
                horizontalLineTo(9.083f)
                curveTo(9.0831f, 20.8761f, 9.4724f, 18.7944f, 10.1769f, 16.7083f)
                curveTo(10.6939f, 15.1776f, 11.4097f, 13.555f, 12.3322f, 12.2676f)
                lineTo(12.0202f, 12.2168f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.2982f, 13.5129f)
                curveTo(12.6225f, 14.5566f, 12.0472f, 15.8582f, 11.5981f, 17.1883f)
                curveTo(10.9202f, 19.1956f, 10.5832f, 21.1037f, 10.583f, 22.0001f)
                horizontalLineTo(11.8718f)
                curveTo(12.9978f, 22.0001f, 13.9043f, 21.0937f, 13.9793f, 19.9799f)
                curveTo(14.1081f, 18.0658f, 14.4036f, 16.3406f, 14.7411f, 15.1137f)
                curveTo(14.407f, 14.9175f, 14.1488f, 14.6597f, 13.9589f, 14.4367f)
                curveTo(13.7399f, 14.1796f, 13.5196f, 13.8585f, 13.2982f, 13.5129f)
                close()
            }
        }
            .build()
        return _starRainbow!!
    }

private var _starRainbow: ImageVector? = null
