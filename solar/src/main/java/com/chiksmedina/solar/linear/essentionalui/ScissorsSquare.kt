package com.chiksmedina.solar.linear.essentionalui

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
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.ScissorsSquare: ImageVector
    get() {
        if (_scissorsSquare != null) {
            return _scissorsSquare!!
        }
        _scissorsSquare = Builder(name = "ScissorsSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5008f, 17.1f)
                lineTo(8.0f, 6.0f)
                moveTo(18.0f, 16.2f)
                curveTo(18.0f, 17.1941f, 17.1605f, 18.0f, 16.125f, 18.0f)
                curveTo(15.0895f, 18.0f, 14.25f, 17.1941f, 14.25f, 16.2f)
                curveTo(14.25f, 15.2059f, 15.0895f, 14.4f, 16.125f, 14.4f)
                curveTo(17.1605f, 14.4f, 18.0f, 15.2059f, 18.0f, 16.2f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.4992f, 17.1f)
                lineTo(16.0f, 6.0f)
                moveTo(6.0f, 16.2f)
                curveTo(6.0f, 17.1941f, 6.8395f, 18.0f, 7.875f, 18.0f)
                curveTo(8.9105f, 18.0f, 9.75f, 17.1941f, 9.75f, 16.2f)
                curveTo(9.75f, 15.2059f, 8.9105f, 14.4f, 7.875f, 14.4f)
                curveTo(6.8395f, 14.4f, 6.0f, 15.2059f, 6.0f, 16.2f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _scissorsSquare!!
    }

private var _scissorsSquare: ImageVector? = null
