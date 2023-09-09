package com.chiksmedina.solar.lineduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MedicineGroup

public val MedicineGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1818f, 10.5455f)
                lineTo(6.7121f, 11.0758f)
                lineTo(6.7121f, 11.0758f)
                lineTo(6.1818f, 10.5455f)
                close()
                moveTo(13.4545f, 17.8182f)
                lineTo(13.9848f, 18.3485f)
                lineTo(13.9848f, 18.3485f)
                lineTo(13.4545f, 17.8182f)
                close()
                moveTo(17.7373f, 9.0101f)
                lineTo(17.207f, 9.5404f)
                lineTo(17.207f, 9.5404f)
                lineTo(17.7373f, 9.0101f)
                close()
                moveTo(19.0238f, 10.5692f)
                lineTo(19.7286f, 10.3127f)
                lineTo(19.0238f, 10.5692f)
                close()
                moveTo(17.7373f, 13.5354f)
                lineTo(17.207f, 13.005f)
                lineTo(17.207f, 13.005f)
                lineTo(17.7373f, 13.5354f)
                close()
                moveTo(19.0238f, 11.9763f)
                lineTo(19.7286f, 12.2328f)
                lineTo(19.0238f, 11.9763f)
                close()
                moveTo(14.9898f, 6.2626f)
                lineTo(15.5202f, 5.7323f)
                lineTo(14.9898f, 6.2626f)
                close()
                moveTo(13.4308f, 4.9761f)
                lineTo(13.1743f, 5.6809f)
                lineTo(13.4308f, 4.9761f)
                close()
                moveTo(10.4646f, 6.2626f)
                lineTo(10.9949f, 6.793f)
                lineTo(10.9949f, 6.793f)
                lineTo(10.4646f, 6.2626f)
                close()
                moveTo(12.0237f, 4.9761f)
                lineTo(12.2802f, 5.6809f)
                lineTo(12.0237f, 4.9761f)
                close()
                moveTo(19.4696f, 7.4394f)
                curveTo(19.7625f, 7.7323f, 20.2374f, 7.7323f, 20.5303f, 7.4394f)
                curveTo(20.8232f, 7.1465f, 20.8232f, 6.6716f, 20.5303f, 6.3788f)
                lineTo(19.4696f, 7.4394f)
                close()
                moveTo(17.6212f, 3.4697f)
                curveTo(17.3283f, 3.1768f, 16.8534f, 3.1768f, 16.5605f, 3.4697f)
                curveTo(16.2676f, 3.7626f, 16.2676f, 4.2374f, 16.5605f, 4.5303f)
                lineTo(17.6212f, 3.4697f)
                close()
                moveTo(14.4595f, 6.793f)
                lineTo(17.207f, 9.5404f)
                lineTo(18.2677f, 8.4798f)
                lineTo(15.5202f, 5.7323f)
                lineTo(14.4595f, 6.793f)
                close()
                moveTo(17.207f, 13.005f)
                lineTo(12.9242f, 17.2879f)
                lineTo(13.9848f, 18.3485f)
                lineTo(18.2677f, 14.0657f)
                lineTo(17.207f, 13.005f)
                close()
                moveTo(6.7121f, 11.0758f)
                lineTo(10.9949f, 6.793f)
                lineTo(9.9343f, 5.7323f)
                lineTo(5.6514f, 10.0151f)
                lineTo(6.7121f, 11.0758f)
                close()
                moveTo(6.7121f, 17.2879f)
                curveTo(4.9967f, 15.5724f, 4.9967f, 12.7912f, 6.7121f, 11.0758f)
                lineTo(5.6514f, 10.0151f)
                curveTo(3.3502f, 12.3163f, 3.3502f, 16.0473f, 5.6514f, 18.3485f)
                lineTo(6.7121f, 17.2879f)
                close()
                moveTo(12.9242f, 17.2879f)
                curveTo(11.2087f, 19.0033f, 8.4275f, 19.0033f, 6.7121f, 17.2879f)
                lineTo(5.6514f, 18.3485f)
                curveTo(7.9526f, 20.6497f, 11.6836f, 20.6497f, 13.9848f, 18.3485f)
                lineTo(12.9242f, 17.2879f)
                close()
                moveTo(17.207f, 9.5404f)
                curveTo(17.5919f, 9.9254f, 17.8507f, 10.1849f, 18.0359f, 10.4003f)
                curveTo(18.2159f, 10.6099f, 18.2849f, 10.7319f, 18.3191f, 10.8257f)
                lineTo(19.7286f, 10.3127f)
                curveTo(19.6068f, 9.9779f, 19.4094f, 9.6973f, 19.1736f, 9.4228f)
                curveTo(18.9429f, 9.1543f, 18.6364f, 8.8485f, 18.2677f, 8.4798f)
                lineTo(17.207f, 9.5404f)
                close()
                moveTo(18.2677f, 14.0657f)
                curveTo(18.6364f, 13.6969f, 18.9429f, 13.3912f, 19.1736f, 13.1226f)
                curveTo(19.4094f, 12.8482f, 19.6068f, 12.5675f, 19.7286f, 12.2328f)
                lineTo(18.3191f, 11.7198f)
                curveTo(18.2849f, 11.8136f, 18.2159f, 11.9356f, 18.0359f, 12.1451f)
                curveTo(17.8507f, 12.3606f, 17.5919f, 12.6201f, 17.207f, 13.005f)
                lineTo(18.2677f, 14.0657f)
                close()
                moveTo(18.3191f, 10.8257f)
                curveTo(18.4242f, 11.1145f, 18.4242f, 11.431f, 18.3191f, 11.7198f)
                lineTo(19.7286f, 12.2328f)
                curveTo(19.9543f, 11.6126f, 19.9543f, 10.9328f, 19.7286f, 10.3127f)
                lineTo(18.3191f, 10.8257f)
                close()
                moveTo(15.5202f, 5.7323f)
                curveTo(15.1514f, 5.3635f, 14.8457f, 5.0571f, 14.5771f, 4.8264f)
                curveTo(14.3027f, 4.5905f, 14.022f, 4.3932f, 13.6873f, 4.2713f)
                lineTo(13.1743f, 5.6809f)
                curveTo(13.268f, 5.715f, 13.3901f, 5.7841f, 13.5996f, 5.9641f)
                curveTo(13.8151f, 6.1492f, 14.0746f, 6.408f, 14.4595f, 6.793f)
                lineTo(15.5202f, 5.7323f)
                close()
                moveTo(10.9949f, 6.793f)
                curveTo(11.3799f, 6.408f, 11.6394f, 6.1492f, 11.8548f, 5.9641f)
                curveTo(12.0644f, 5.7841f, 12.1864f, 5.715f, 12.2802f, 5.6809f)
                lineTo(11.7672f, 4.2713f)
                curveTo(11.4324f, 4.3932f, 11.1518f, 4.5905f, 10.8773f, 4.8264f)
                curveTo(10.6088f, 5.0571f, 10.303f, 5.3635f, 9.9343f, 5.7323f)
                lineTo(10.9949f, 6.793f)
                close()
                moveTo(13.6873f, 4.2713f)
                curveTo(13.0671f, 4.0456f, 12.3873f, 4.0456f, 11.7672f, 4.2713f)
                lineTo(12.2802f, 5.6809f)
                curveTo(12.5689f, 5.5758f, 12.8855f, 5.5758f, 13.1743f, 5.6809f)
                lineTo(13.6873f, 4.2713f)
                close()
                moveTo(18.0151f, 5.9849f)
                lineTo(19.4696f, 7.4394f)
                lineTo(20.5303f, 6.3788f)
                lineTo(19.0757f, 4.9242f)
                lineTo(18.0151f, 5.9849f)
                close()
                moveTo(19.0757f, 4.9242f)
                lineTo(17.6212f, 3.4697f)
                lineTo(16.5605f, 4.5303f)
                lineTo(18.0151f, 5.9849f)
                lineTo(19.0757f, 4.9242f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.091f, 14.1819f)
                lineTo(9.8182f, 6.9092f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.1818f, 17.8184f)
                lineTo(4.0f, 20.0002f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8332f, 7.1061f)
                curveTo(15.5403f, 7.399f, 15.5403f, 7.8738f, 15.8332f, 8.1667f)
                curveTo(16.1261f, 8.4596f, 16.601f, 8.4596f, 16.8939f, 8.1667f)
                lineTo(15.8332f, 7.1061f)
                close()
                moveTo(19.0757f, 5.9849f)
                curveTo(19.3686f, 5.692f, 19.3686f, 5.2172f, 19.0757f, 4.9243f)
                curveTo(18.7828f, 4.6314f, 18.3079f, 4.6314f, 18.015f, 4.9243f)
                lineTo(19.0757f, 5.9849f)
                close()
                moveTo(16.8939f, 8.1667f)
                lineTo(19.0757f, 5.9849f)
                lineTo(18.015f, 4.9243f)
                lineTo(15.8332f, 7.1061f)
                lineTo(16.8939f, 8.1667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3787f, 16.894f)
                curveTo(14.6716f, 17.1869f, 15.1464f, 17.1869f, 15.4393f, 16.894f)
                curveTo(15.7322f, 16.6011f, 15.7322f, 16.1262f, 15.4393f, 15.8333f)
                lineTo(14.3787f, 16.894f)
                close()
                moveTo(12.554f, 12.9479f)
                curveTo(12.2611f, 12.655f, 11.7862f, 12.655f, 11.4933f, 12.9479f)
                curveTo(11.2004f, 13.2408f, 11.2004f, 13.7157f, 11.4933f, 14.0086f)
                lineTo(12.554f, 12.9479f)
                close()
                moveTo(12.7423f, 18.5303f)
                curveTo(13.0352f, 18.8232f, 13.5101f, 18.8232f, 13.803f, 18.5303f)
                curveTo(14.0959f, 18.2374f, 14.0959f, 17.7626f, 13.803f, 17.4697f)
                lineTo(12.7423f, 18.5303f)
                close()
                moveTo(12.157f, 15.8237f)
                curveTo(11.8641f, 15.5308f, 11.3893f, 15.5308f, 11.0964f, 15.8237f)
                curveTo(10.8035f, 16.1166f, 10.8035f, 16.5915f, 11.0964f, 16.8844f)
                lineTo(12.157f, 15.8237f)
                close()
                moveTo(15.4393f, 15.8333f)
                lineTo(12.554f, 12.9479f)
                lineTo(11.4933f, 14.0086f)
                lineTo(14.3787f, 16.894f)
                lineTo(15.4393f, 15.8333f)
                close()
                moveTo(13.803f, 17.4697f)
                lineTo(12.157f, 15.8237f)
                lineTo(11.0964f, 16.8844f)
                lineTo(12.7423f, 18.5303f)
                lineTo(13.803f, 17.4697f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
