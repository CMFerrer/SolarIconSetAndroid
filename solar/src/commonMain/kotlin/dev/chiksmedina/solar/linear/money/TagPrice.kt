package dev.chiksmedina.solar.linear.money

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
import dev.chiksmedina.solar.linear.MoneyGroup

val MoneyGroup.TagPrice: ImageVector
    get() {
        if (_tagPrice != null) {
            return _tagPrice!!
        }
        _tagPrice = Builder(
            name = "TagPrice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.7285f, 16.1369f)
                curveTo(3.183f, 14.5914f, 2.4102f, 13.8186f, 2.1227f, 12.816f)
                curveTo(1.8352f, 11.8134f, 2.0809f, 10.7485f, 2.5724f, 8.6187f)
                lineTo(2.8558f, 7.3906f)
                curveTo(3.2693f, 5.5988f, 3.476f, 4.7029f, 4.0895f, 4.0894f)
                curveTo(4.703f, 3.476f, 5.5989f, 3.2692f, 7.3906f, 2.8557f)
                lineTo(8.6188f, 2.5723f)
                curveTo(10.7486f, 2.0808f, 11.8134f, 1.8351f, 12.816f, 2.1226f)
                curveTo(13.8186f, 2.4102f, 14.5914f, 3.183f, 16.1369f, 4.7285f)
                lineTo(17.9666f, 6.5581f)
                curveTo(20.6556f, 9.2471f, 22.0001f, 10.5916f, 22.0001f, 12.2623f)
                curveTo(22.0001f, 13.933f, 20.6556f, 15.2775f, 17.9666f, 17.9665f)
                curveTo(15.2776f, 20.6555f, 13.9331f, 22.0f, 12.2624f, 22.0f)
                curveTo(10.5917f, 22.0f, 9.2472f, 20.6555f, 6.5582f, 17.9665f)
                lineTo(4.7285f, 16.1369f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.3893f, 15.3891f)
                curveTo(15.9751f, 14.8033f, 16.0542f, 13.9327f, 15.5661f, 13.4445f)
                curveTo(15.0779f, 12.9564f, 14.2073f, 13.0355f, 13.6215f, 13.6213f)
                curveTo(13.0358f, 14.2071f, 12.1652f, 14.2863f, 11.677f, 13.7981f)
                curveTo(11.1888f, 13.3099f, 11.268f, 12.4393f, 11.8538f, 11.8536f)
                moveTo(15.3893f, 15.3891f)
                lineTo(15.7429f, 15.7426f)
                moveTo(15.3893f, 15.3891f)
                curveTo(14.9883f, 15.7901f, 14.4539f, 15.9537f, 14.0f, 15.8604f)
                moveTo(11.5002f, 11.5f)
                lineTo(11.8538f, 11.8536f)
                moveTo(11.8538f, 11.8536f)
                curveTo(12.185f, 11.5223f, 12.6073f, 11.3531f, 13.0f, 11.3568f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.607f, 8.8789f)
                moveToRelative(-1.4142f, 1.4142f)
                arcToRelative(2.0f, 2.0f, 104.4054f, true, true, 2.8284f, -2.8284f)
                arcToRelative(2.0f, 2.0f, 104.4054f, true, true, -2.8284f, 2.8284f)
            }
        }
            .build()
        return _tagPrice!!
    }

private var _tagPrice: ImageVector? = null
