package com.chiksmedina.solar.bold.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.BusinessStatisticGroup

public val BusinessStatisticGroup.ChatSquare2: ImageVector
    get() {
        if (_chatSquare2 != null) {
            return _chatSquare2!!
        }
        _chatSquare2 = Builder(name = "ChatSquare2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(17.0f, 8.25f)
                curveTo(17.4142f, 8.25f, 17.75f, 8.5858f, 17.75f, 9.0f)
                verticalLineTo(18.0f)
                curveTo(17.75f, 18.4142f, 17.4142f, 18.75f, 17.0f, 18.75f)
                curveTo(16.5858f, 18.75f, 16.25f, 18.4142f, 16.25f, 18.0f)
                verticalLineTo(9.0f)
                curveTo(16.25f, 8.5858f, 16.5858f, 8.25f, 17.0f, 8.25f)
                close()
                moveTo(12.75f, 12.0f)
                curveTo(12.75f, 11.5858f, 12.4142f, 11.25f, 12.0f, 11.25f)
                curveTo(11.5858f, 11.25f, 11.25f, 11.5858f, 11.25f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(11.25f, 18.4142f, 11.5858f, 18.75f, 12.0f, 18.75f)
                curveTo(12.4142f, 18.75f, 12.75f, 18.4142f, 12.75f, 18.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(7.0f, 14.25f)
                curveTo(7.4142f, 14.25f, 7.75f, 14.5858f, 7.75f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(7.75f, 18.4142f, 7.4142f, 18.75f, 7.0f, 18.75f)
                curveTo(6.5858f, 18.75f, 6.25f, 18.4142f, 6.25f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(6.25f, 14.5858f, 6.5858f, 14.25f, 7.0f, 14.25f)
                close()
            }
        }
        .build()
        return _chatSquare2!!
    }

private var _chatSquare2: ImageVector? = null
