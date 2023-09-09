package com.chiksmedina.solar.broken.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.TextFormattingGroup

public val TextFormattingGroup.LinkSquare: ImageVector
    get() {
        if (_linkSquare != null) {
            return _linkSquare!!
        }
        _linkSquare = Builder(name = "LinkSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 18.0f)
                curveTo(5.1716f, 18.0f, 3.7574f, 18.0f, 2.8787f, 17.1213f)
                curveTo(2.0f, 16.2426f, 2.0f, 14.8284f, 2.0f, 12.0f)
                curveTo(2.0f, 9.1716f, 2.0f, 7.7574f, 2.8787f, 6.8787f)
                curveTo(3.7574f, 6.0f, 5.1716f, 6.0f, 8.0f, 6.0f)
                curveTo(10.8284f, 6.0f, 12.2426f, 6.0f, 13.1213f, 6.8787f)
                curveTo(14.0f, 7.7574f, 14.0f, 9.1716f, 14.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 14.8284f, 10.0f, 16.2426f, 10.8787f, 17.1213f)
                curveTo(11.7574f, 18.0f, 13.1716f, 18.0f, 16.0f, 18.0f)
                curveTo(18.8284f, 18.0f, 20.2426f, 18.0f, 21.1213f, 17.1213f)
                curveTo(21.4211f, 16.8215f, 21.6186f, 16.4594f, 21.7487f, 16.0f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 9.1716f, 22.0f, 7.7574f, 21.1213f, 6.8787f)
                curveTo(20.2426f, 6.0f, 18.8284f, 6.0f, 16.0f, 6.0f)
            }
        }
        .build()
        return _linkSquare!!
    }

private var _linkSquare: ImageVector? = null
