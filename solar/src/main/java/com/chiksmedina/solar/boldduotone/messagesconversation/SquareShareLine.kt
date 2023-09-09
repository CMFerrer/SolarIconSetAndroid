package com.chiksmedina.solar.boldduotone.messagesconversation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.MessagesConversationGroup

public val MessagesConversationGroup.SquareShareLine: ImageVector
    get() {
        if (_squareShareLine != null) {
            return _squareShareLine!!
        }
        _squareShareLine = Builder(name = "SquareShareLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.4697f, 1.4697f)
                curveTo(16.7626f, 1.1768f, 17.2374f, 1.1768f, 17.5303f, 1.4697f)
                lineTo(22.5303f, 6.4697f)
                curveTo(22.8232f, 6.7626f, 22.8232f, 7.2374f, 22.5303f, 7.5303f)
                lineTo(17.5303f, 12.5303f)
                curveTo(17.2374f, 12.8232f, 16.7626f, 12.8232f, 16.4697f, 12.5303f)
                curveTo(16.1768f, 12.2374f, 16.1768f, 11.7626f, 16.4697f, 11.4697f)
                lineTo(20.1893f, 7.75f)
                horizontalLineTo(14.0f)
                curveTo(12.4485f, 7.75f, 11.5328f, 8.507f, 11.212f, 8.8293f)
                lineTo(11.0211f, 9.0211f)
                lineTo(10.8293f, 9.2121f)
                curveTo(10.507f, 9.5328f, 9.75f, 10.4485f, 9.75f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(9.75f, 15.4142f, 9.4142f, 15.75f, 9.0f, 15.75f)
                curveTo(8.5858f, 15.75f, 8.25f, 15.4142f, 8.25f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(8.25f, 9.9162f, 9.277f, 8.6406f, 9.7712f, 8.1488f)
                lineTo(9.9605f, 7.9605f)
                lineTo(10.1488f, 7.7712f)
                curveTo(10.6406f, 7.277f, 11.9162f, 6.25f, 14.0f, 6.25f)
                horizontalLineTo(20.1893f)
                lineTo(16.4697f, 2.5303f)
                curveTo(16.1768f, 2.2374f, 16.1768f, 1.7626f, 16.4697f, 1.4697f)
                close()
            }
        }
        .build()
        return _squareShareLine!!
    }

private var _squareShareLine: ImageVector? = null
