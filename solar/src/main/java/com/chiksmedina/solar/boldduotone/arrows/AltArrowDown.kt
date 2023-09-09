package com.chiksmedina.solar.boldduotone.arrows

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
import com.chiksmedina.solar.boldduotone.ArrowsGroup

public val ArrowsGroup.AltArrowDown: ImageVector
    get() {
        if (_altArrowDown != null) {
            return _altArrowDown!!
        }
        _altArrowDown = Builder(name = "AltArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3027f, 12.4044f)
                lineTo(11.6296f, 15.8351f)
                curveTo(11.8428f, 16.0549f, 12.1573f, 16.0549f, 12.3704f, 15.8351f)
                lineTo(18.8001f, 9.2047f)
                curveTo(19.2013f, 8.7909f, 18.9581f, 8.0f, 18.4297f, 8.0f)
                horizontalLineTo(12.7071f)
                lineTo(8.3027f, 12.4044f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.2929f, 8.0f)
                horizontalLineTo(5.5703f)
                curveTo(5.0419f, 8.0f, 4.7987f, 8.7909f, 5.1999f, 9.2047f)
                lineTo(7.6065f, 11.6864f)
                lineTo(11.2929f, 8.0f)
                close()
            }
        }
        .build()
        return _altArrowDown!!
    }

private var _altArrowDown: ImageVector? = null