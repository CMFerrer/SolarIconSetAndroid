package com.chiksmedina.solar.boldduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.MoneyGroup

public val MoneyGroup.TagPrice: ImageVector
    get() {
        if (_tagPrice != null) {
            return _tagPrice!!
        }
        _tagPrice = Builder(name = "TagPrice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9665f, 6.5581f)
                lineTo(16.1369f, 4.7285f)
                lineTo(16.1369f, 4.7285f)
                curveTo(14.5913f, 3.183f, 13.8186f, 2.4102f, 12.816f, 2.1226f)
                curveTo(11.8134f, 1.8351f, 10.7485f, 2.0808f, 8.6187f, 2.5723f)
                lineTo(7.3906f, 2.8557f)
                curveTo(5.5988f, 3.2692f, 4.7029f, 3.476f, 4.0894f, 4.0894f)
                curveTo(3.476f, 4.7029f, 3.2692f, 5.5988f, 2.8557f, 7.3906f)
                lineTo(2.8557f, 7.3906f)
                lineTo(2.5723f, 8.6187f)
                curveTo(2.0808f, 10.7485f, 1.8351f, 11.8134f, 2.1226f, 12.816f)
                curveTo(2.4102f, 13.8186f, 3.183f, 14.5914f, 4.7285f, 16.1369f)
                lineTo(6.5581f, 17.9665f)
                lineTo(6.5581f, 17.9665f)
                curveTo(9.2471f, 20.6555f, 10.5916f, 22.0f, 12.2623f, 22.0f)
                curveTo(13.933f, 22.0f, 15.2775f, 20.6555f, 17.9665f, 17.9665f)
                lineTo(17.9665f, 17.9665f)
                lineTo(17.9665f, 17.9665f)
                curveTo(20.6555f, 15.2775f, 22.0f, 13.933f, 22.0f, 12.2623f)
                curveTo(22.0f, 10.5916f, 20.6555f, 9.2471f, 17.9665f, 6.5581f)
                lineTo(17.9665f, 6.5581f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1469f, 14.3284f)
                curveTo(10.4739f, 13.6555f, 10.4796f, 12.6899f, 10.882f, 11.9247f)
                curveTo(10.6809f, 11.6325f, 10.7103f, 11.2295f, 10.9701f, 10.9697f)
                curveTo(11.2289f, 10.7108f, 11.63f, 10.6807f, 11.9219f, 10.8795f)
                curveTo(12.2617f, 10.6988f, 12.6351f, 10.6033f, 13.0073f, 10.6068f)
                curveTo(13.4215f, 10.6107f, 13.7541f, 10.9497f, 13.7502f, 11.3639f)
                curveTo(13.7462f, 11.7781f, 13.4073f, 12.1107f, 12.9931f, 12.1068f)
                curveTo(12.8162f, 12.1051f, 12.5837f, 12.1845f, 12.3843f, 12.3839f)
                curveTo(11.9968f, 12.7714f, 12.0987f, 13.1589f, 12.2075f, 13.2678f)
                curveTo(12.3164f, 13.3766f, 12.7039f, 13.4785f, 13.0914f, 13.091f)
                curveTo(13.8754f, 12.307f, 15.2291f, 12.0467f, 16.0966f, 12.9142f)
                curveTo(16.7696f, 13.5872f, 16.7639f, 14.5528f, 16.3614f, 15.318f)
                curveTo(16.5625f, 15.6102f, 16.5332f, 16.0132f, 16.2734f, 16.273f)
                curveTo(16.0145f, 16.5319f, 15.6133f, 16.5619f, 15.3214f, 16.3631f)
                curveTo(14.8645f, 16.6059f, 14.3448f, 16.6969f, 13.8492f, 16.595f)
                curveTo(13.4435f, 16.5117f, 13.1822f, 16.1152f, 13.2655f, 15.7094f)
                curveTo(13.3489f, 15.3037f, 13.7454f, 15.0424f, 14.1512f, 15.1257f)
                curveTo(14.3283f, 15.1622f, 14.6139f, 15.104f, 14.8592f, 14.8588f)
                curveTo(15.2467f, 14.4712f, 15.1448f, 14.0837f, 15.0359f, 13.9749f)
                curveTo(14.9271f, 13.866f, 14.5396f, 13.7641f, 14.1521f, 14.1517f)
                curveTo(13.368f, 14.9357f, 12.0143f, 15.1959f, 11.1469f, 14.3284f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0211f, 10.2931f)
                curveTo(10.8022f, 9.5121f, 10.8022f, 8.2457f, 10.0211f, 7.4647f)
                curveTo(9.2401f, 6.6836f, 7.9738f, 6.6836f, 7.1927f, 7.4647f)
                curveTo(6.4117f, 8.2457f, 6.4117f, 9.5121f, 7.1927f, 10.2931f)
                curveTo(7.9738f, 11.0742f, 9.2401f, 11.0742f, 10.0211f, 10.2931f)
                close()
            }
        }
        .build()
        return _tagPrice!!
    }

private var _tagPrice: ImageVector? = null
