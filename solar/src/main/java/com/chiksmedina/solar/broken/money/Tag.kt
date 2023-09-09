package com.chiksmedina.solar.broken.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MoneyGroup

public val MoneyGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1369f, 4.7285f)
                curveTo(14.5914f, 3.183f, 13.8186f, 2.4102f, 12.816f, 2.1226f)
                curveTo(11.8134f, 1.8351f, 10.7485f, 2.0808f, 8.6187f, 2.5723f)
                lineTo(7.3906f, 2.8557f)
                curveTo(5.5988f, 3.2692f, 4.7029f, 3.476f, 4.0894f, 4.0894f)
                curveTo(3.476f, 4.7029f, 3.2692f, 5.5988f, 2.8557f, 7.3906f)
                lineTo(2.5723f, 8.6187f)
                curveTo(2.0808f, 10.7485f, 1.8351f, 11.8134f, 2.1226f, 12.816f)
                curveTo(2.4102f, 13.8186f, 3.183f, 14.5914f, 4.7285f, 16.1369f)
                lineTo(6.5581f, 17.9665f)
                curveTo(9.2471f, 20.6555f, 10.5916f, 22.0f, 12.2623f, 22.0f)
                curveTo(13.933f, 22.0f, 15.2775f, 20.6555f, 17.9665f, 17.9665f)
                curveTo(20.6555f, 15.2775f, 22.0f, 13.933f, 22.0f, 12.2623f)
                curveTo(22.0f, 10.9198f, 21.1319f, 9.788f, 19.3957f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.6069f, 10.8789f)
                curveTo(9.7115f, 10.8789f, 10.6069f, 9.9835f, 10.6069f, 8.8789f)
                curveTo(10.6069f, 7.7743f, 9.7115f, 6.8789f, 8.6069f, 6.8789f)
                curveTo(7.5024f, 6.8789f, 6.6069f, 7.7743f, 6.6069f, 8.8789f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5416f, 18.5001f)
                lineTo(12.5416f, 17.5001f)
                moveTo(18.5206f, 11.5209f)
                lineTo(14.9999f, 15.0417f)
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
