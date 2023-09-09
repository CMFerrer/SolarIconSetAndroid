package com.chiksmedina.solar.lineduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.SchoolGroup

public val SchoolGroup.CalculatorMinimalistic: ImageVector
    get() {
        if (_calculatorMinimalistic != null) {
            return _calculatorMinimalistic!!
        }
        _calculatorMinimalistic = Builder(name = "CalculatorMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 8.5f)
                horizontalLineTo(14.0f)
                moveTo(18.0f, 14.5f)
                horizontalLineTo(14.0f)
                moveTo(18.0f, 17.5f)
                horizontalLineTo(14.0f)
                moveTo(10.0f, 8.5f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 8.5f)
                lineTo(6.0f, 8.5f)
                moveTo(8.0f, 8.5f)
                lineTo(8.0f, 6.5f)
                moveTo(8.0f, 8.5f)
                lineTo(8.0f, 10.5f)
                moveTo(9.5f, 14.5f)
                lineTo(8.0f, 16.0f)
                moveTo(8.0f, 16.0f)
                lineTo(6.5f, 17.5f)
                moveTo(8.0f, 16.0f)
                lineTo(6.5f, 14.5f)
                moveTo(8.0f, 16.0f)
                lineTo(9.5f, 17.5f)
            }
        }
        .build()
        return _calculatorMinimalistic!!
    }

private var _calculatorMinimalistic: ImageVector? = null
