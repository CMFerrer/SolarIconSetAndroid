package com.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MedicineGroup

public val MedicineGroup.Bacteria: ImageVector
    get() {
        if (_bacteria != null) {
            return _bacteria!!
        }
        _bacteria = Builder(name = "Bacteria", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0002f, 4.25f)
                horizontalLineTo(12.0002f)
                curveTo(12.4144f, 4.25f, 12.7502f, 4.5858f, 12.7502f, 5.0f)
                curveTo(12.7502f, 5.4142f, 12.4144f, 5.75f, 12.0002f, 5.75f)
                horizontalLineTo(10.0002f)
                curveTo(9.586f, 5.75f, 9.2502f, 5.4142f, 9.2502f, 5.0f)
                curveTo(9.2502f, 4.5858f, 9.586f, 4.25f, 10.0002f, 4.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7433f, 9.1904f)
                curveTo(9.7999f, 9.6007f, 9.5131f, 9.9792f, 9.1028f, 10.0358f)
                lineTo(9.1016f, 10.036f)
                lineTo(9.1003f, 10.0362f)
                lineTo(9.0972f, 10.0366f)
                lineTo(9.0898f, 10.0375f)
                lineTo(9.0694f, 10.0399f)
                curveTo(9.0534f, 10.0417f, 9.0326f, 10.0438f, 9.0074f, 10.0459f)
                curveTo(8.9571f, 10.0501f, 8.8888f, 10.0543f, 8.8059f, 10.0558f)
                curveTo(8.641f, 10.0588f, 8.4132f, 10.0511f, 8.1512f, 10.0094f)
                curveTo(7.6312f, 9.9266f, 6.9345f, 9.7019f, 6.3487f, 9.1161f)
                curveTo(5.7628f, 8.5303f, 5.5381f, 7.8336f, 5.4553f, 7.3136f)
                curveTo(5.4136f, 7.0515f, 5.406f, 6.8238f, 5.409f, 6.6589f)
                curveTo(5.4105f, 6.576f, 5.4146f, 6.5077f, 5.4188f, 6.4574f)
                curveTo(5.4209f, 6.4322f, 5.423f, 6.4113f, 5.4248f, 6.3953f)
                lineTo(5.4272f, 6.3749f)
                lineTo(5.4282f, 6.3675f)
                curveTo(5.4848f, 5.9572f, 5.864f, 5.6649f, 6.2744f, 5.7215f)
                curveTo(6.6828f, 5.7778f, 6.9689f, 6.1532f, 6.9156f, 6.5614f)
                curveTo(6.8793f, 7.224f, 7.226f, 8.5492f, 8.9034f, 8.5492f)
                curveTo(9.3116f, 8.4959f, 9.687f, 8.7819f, 9.7433f, 9.1904f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9699f, 7.9697f)
                curveTo(11.2628f, 7.6768f, 11.7376f, 7.6768f, 12.0305f, 7.9697f)
                lineTo(13.0305f, 8.9697f)
                curveTo(13.3234f, 9.2626f, 13.3234f, 9.7374f, 13.0305f, 10.0303f)
                curveTo(12.7376f, 10.3232f, 12.2628f, 10.3232f, 11.9699f, 10.0303f)
                lineTo(10.9699f, 9.0303f)
                curveTo(10.677f, 8.7374f, 10.677f, 8.2626f, 10.9699f, 7.9697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2502f, 12.0f)
                curveTo(15.2502f, 11.5858f, 14.9144f, 11.25f, 14.5002f, 11.25f)
                curveTo(14.086f, 11.25f, 13.7502f, 11.5858f, 13.7502f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(13.7502f, 14.4142f, 14.086f, 14.75f, 14.5002f, 14.75f)
                curveTo(14.9144f, 14.75f, 15.2502f, 14.4142f, 15.2502f, 14.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4727f, 17.5656f)
                lineTo(17.4713f, 17.5644f)
                lineTo(17.4699f, 17.5631f)
                lineTo(17.4667f, 17.5603f)
                lineTo(17.4594f, 17.5538f)
                lineTo(17.4412f, 17.537f)
                curveTo(17.4276f, 17.5242f, 17.411f, 17.508f, 17.392f, 17.4884f)
                curveTo(17.354f, 17.4493f, 17.306f, 17.3965f, 17.2529f, 17.3297f)
                curveTo(17.1469f, 17.1963f, 17.0182f, 17.0049f, 16.9079f, 16.7546f)
                curveTo(16.6821f, 16.2425f, 16.5499f, 15.5199f, 16.7923f, 14.6151f)
                curveTo(17.0347f, 13.7102f, 17.5106f, 13.1505f, 17.9622f, 12.8199f)
                curveTo(18.1829f, 12.6583f, 18.39f, 12.5569f, 18.5485f, 12.4944f)
                curveTo(18.6279f, 12.4631f, 18.6959f, 12.4413f, 18.7483f, 12.4265f)
                curveTo(18.7746f, 12.419f, 18.7971f, 12.4133f, 18.8153f, 12.409f)
                lineTo(18.8394f, 12.4036f)
                lineTo(18.849f, 12.4015f)
                lineTo(18.8532f, 12.4007f)
                lineTo(18.8551f, 12.4003f)
                curveTo(18.8551f, 12.4003f, 18.8569f, 12.4f, 19.0003f, 13.1361f)
                lineTo(18.8569f, 12.4f)
                curveTo(19.2635f, 12.3208f, 19.6572f, 12.5862f, 19.7365f, 12.9927f)
                curveTo(19.8146f, 13.394f, 19.5571f, 13.7828f, 19.1595f, 13.869f)
                lineTo(19.1568f, 13.8698f)
                curveTo(19.148f, 13.8723f, 19.1276f, 13.8785f, 19.0985f, 13.89f)
                curveTo(19.0399f, 13.913f, 18.9496f, 13.956f, 18.8482f, 14.0302f)
                curveTo(18.6559f, 14.1711f, 18.39f, 14.4479f, 18.2412f, 15.0032f)
                curveTo(18.0924f, 15.5586f, 18.1842f, 15.9314f, 18.2804f, 16.1495f)
                curveTo(18.3311f, 16.2644f, 18.3878f, 16.3468f, 18.427f, 16.3961f)
                curveTo(18.4465f, 16.4206f, 18.461f, 16.4362f, 18.4674f, 16.4428f)
                lineTo(18.4694f, 16.4447f)
                curveTo(18.7706f, 16.7182f, 18.7992f, 17.1837f, 18.5308f, 17.4921f)
                curveTo(18.2589f, 17.8046f, 17.7852f, 17.8375f, 17.4727f, 17.5656f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6072f, 10.7869f)
                curveTo(5.7657f, 10.4042f, 5.5839f, 9.9655f, 5.2012f, 9.807f)
                curveTo(4.8185f, 9.6486f, 4.3798f, 9.8304f, 4.2213f, 10.2131f)
                lineTo(3.8073f, 11.2131f)
                curveTo(3.6488f, 11.5958f, 3.8306f, 12.0345f, 4.2133f, 12.1929f)
                curveTo(4.596f, 12.3514f, 5.0347f, 12.1696f, 5.1931f, 11.7869f)
                lineTo(5.6072f, 10.7869f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5619f, 7.9152f)
                curveTo(14.1538f, 7.9684f, 13.7784f, 7.6824f, 13.7221f, 7.2739f)
                curveTo(13.6655f, 6.8636f, 13.9578f, 6.4843f, 14.3681f, 6.4278f)
                curveTo(14.3681f, 6.4278f, 14.4327f, 6.4205f, 14.4579f, 6.4184f)
                curveTo(14.5083f, 6.4142f, 14.5766f, 6.41f, 14.6595f, 6.4085f)
                curveTo(14.8243f, 6.4056f, 15.0521f, 6.4132f, 15.3142f, 6.4549f)
                curveTo(15.8342f, 6.5377f, 16.5308f, 6.7624f, 17.1167f, 7.3482f)
                curveTo(17.7025f, 7.9341f, 17.9272f, 8.6307f, 18.01f, 9.1507f)
                curveTo(18.0517f, 9.4128f, 18.0593f, 9.6406f, 18.0564f, 9.8055f)
                curveTo(18.0549f, 9.8883f, 18.0507f, 9.9566f, 18.0465f, 10.007f)
                curveTo(18.0444f, 10.0322f, 18.0423f, 10.053f, 18.0405f, 10.069f)
                curveTo(17.9839f, 10.4793f, 17.6013f, 10.7994f, 17.191f, 10.7429f)
                curveTo(16.7825f, 10.6865f, 16.4965f, 10.3112f, 16.5497f, 9.903f)
                curveTo(16.5497f, 8.2254f, 15.2245f, 7.8788f, 14.5619f, 7.9152f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8816f, 17.18f)
                curveTo(13.5546f, 16.9257f, 13.0834f, 16.9845f, 12.8291f, 17.3115f)
                curveTo(12.5748f, 17.6384f, 12.6337f, 18.1096f, 12.9606f, 18.364f)
                lineTo(14.5392f, 19.5919f)
                curveTo(14.8662f, 19.8463f, 15.3374f, 19.7874f, 15.5917f, 19.4605f)
                curveTo(15.846f, 19.1335f, 15.7872f, 18.6623f, 15.4602f, 18.408f)
                lineTo(13.8816f, 17.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 11.25f)
                curveTo(6.9289f, 11.25f, 5.25f, 12.9289f, 5.25f, 15.0f)
                curveTo(5.25f, 17.0711f, 6.9289f, 18.75f, 9.0f, 18.75f)
                curveTo(11.0711f, 18.75f, 12.75f, 17.0711f, 12.75f, 15.0f)
                curveTo(12.75f, 12.9289f, 11.0711f, 11.25f, 9.0f, 11.25f)
                close()
                moveTo(6.75f, 15.0f)
                curveTo(6.75f, 13.7574f, 7.7574f, 12.75f, 9.0f, 12.75f)
                curveTo(10.2426f, 12.75f, 11.25f, 13.7574f, 11.25f, 15.0f)
                curveTo(11.25f, 16.2426f, 10.2426f, 17.25f, 9.0f, 17.25f)
                curveTo(7.7574f, 17.25f, 6.75f, 16.2426f, 6.75f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
            }
        }
        .build()
        return _bacteria!!
    }

private var _bacteria: ImageVector? = null
