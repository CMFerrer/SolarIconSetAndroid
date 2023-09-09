package com.chiksmedina.solar.linear.textformatting

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
import com.chiksmedina.solar.linear.TextFormattingGroup

public val TextFormattingGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0464f, 14.0f)
                curveTo(8.5404f, 12.4882f, 8.6761f, 9.9009f, 10.3494f, 8.2211f)
                lineTo(15.197f, 3.3546f)
                curveTo(16.8703f, 1.6748f, 19.4476f, 1.5387f, 20.9536f, 3.0505f)
                curveTo(22.4596f, 4.5623f, 22.3239f, 7.1496f, 20.6506f, 8.8294f)
                lineTo(18.2268f, 11.2626f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.9536f, 10.0f)
                curveTo(15.4596f, 11.5118f, 15.3239f, 14.0991f, 13.6506f, 15.7789f)
                lineTo(11.2268f, 18.2121f)
                lineTo(8.803f, 20.6454f)
                curveTo(7.1297f, 22.3252f, 4.5524f, 22.4613f, 3.0464f, 20.9495f)
                curveTo(1.5404f, 19.4377f, 1.6761f, 16.8504f, 3.3494f, 15.1706f)
                lineTo(5.7732f, 12.7373f)
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
