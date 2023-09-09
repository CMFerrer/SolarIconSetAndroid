package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

public val ArrowsGroup.AltArrowUp: ImageVector
    get() {
        if (_altArrowUp != null) {
            return _altArrowUp!!
        }
        _altArrowUp = Builder(name = "AltArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3704f, 8.1649f)
                lineTo(18.8001f, 14.7953f)
                curveTo(19.2013f, 15.2091f, 18.9581f, 16.0f, 18.4297f, 16.0f)
                horizontalLineTo(5.5703f)
                curveTo(5.0419f, 16.0f, 4.7987f, 15.2091f, 5.1999f, 14.7953f)
                lineTo(11.6296f, 8.1649f)
                curveTo(11.8427f, 7.945f, 12.1573f, 7.945f, 12.3704f, 8.1649f)
                close()
            }
        }
        .build()
        return _altArrowUp!!
    }

private var _altArrowUp: ImageVector? = null
