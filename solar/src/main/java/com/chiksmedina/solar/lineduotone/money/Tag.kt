package com.chiksmedina.solar.lineduotone.money

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
import com.chiksmedina.solar.lineduotone.MoneyGroup

public val MoneyGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.7285f, 16.1369f)
                curveTo(3.183f, 14.5914f, 2.4102f, 13.8186f, 2.1226f, 12.816f)
                curveTo(1.8351f, 11.8134f, 2.0808f, 10.7485f, 2.5723f, 8.6187f)
                lineTo(2.8557f, 7.3906f)
                curveTo(3.2692f, 5.5988f, 3.476f, 4.7029f, 4.0894f, 4.0894f)
                curveTo(4.7029f, 3.476f, 5.5988f, 3.2692f, 7.3906f, 2.8557f)
                lineTo(8.6187f, 2.5723f)
                curveTo(10.7485f, 2.0808f, 11.8134f, 1.8351f, 12.816f, 2.1226f)
                curveTo(13.8186f, 2.4102f, 14.5914f, 3.183f, 16.1369f, 4.7285f)
                lineTo(17.9665f, 6.5581f)
                curveTo(20.6555f, 9.2471f, 22.0f, 10.5916f, 22.0f, 12.2623f)
                curveTo(22.0f, 13.933f, 20.6555f, 15.2775f, 17.9665f, 17.9665f)
                curveTo(15.2775f, 20.6555f, 13.933f, 22.0f, 12.2623f, 22.0f)
                curveTo(10.5916f, 22.0f, 9.2471f, 20.6555f, 6.5581f, 17.9665f)
                lineTo(4.7285f, 16.1369f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.607f, 8.8789f)
                moveToRelative(-1.4142f, 1.4142f)
                arcToRelative(2.0f, 2.0f, 69.6994f, true, true, 2.8284f, -2.8284f)
                arcToRelative(2.0f, 2.0f, 69.6994f, true, true, -2.8284f, 2.8284f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5417f, 18.5f)
                lineTo(18.5208f, 11.5208f)
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
