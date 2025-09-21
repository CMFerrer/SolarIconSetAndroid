package dev.chiksmedina.solar.boldduotone.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ListGroup

val ListGroup.ListCheck: ImageVector
    get() {
        if (_listCheck != null) {
            return _listCheck!!
        }
        _listCheck = Builder(
            name = "ListCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 5.75f)
                curveTo(2.0f, 5.3358f, 2.3358f, 5.0f, 2.75f, 5.0f)
                horizontalLineTo(20.75f)
                curveTo(21.1642f, 5.0f, 21.5f, 5.3358f, 21.5f, 5.75f)
                curveTo(21.5f, 6.1642f, 21.1642f, 6.5f, 20.75f, 6.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 6.5f, 2.0f, 6.1642f, 2.0f, 5.75f)
                close()
                moveTo(2.0f, 9.75f)
                curveTo(2.0f, 9.3358f, 2.3358f, 9.0f, 2.75f, 9.0f)
                horizontalLineTo(20.75f)
                curveTo(21.1642f, 9.0f, 21.5f, 9.3358f, 21.5f, 9.75f)
                curveTo(21.5f, 10.1642f, 21.1642f, 10.5f, 20.75f, 10.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 10.5f, 2.0f, 10.1642f, 2.0f, 9.75f)
                close()
                moveTo(2.0f, 13.75f)
                curveTo(2.0f, 13.3358f, 2.3358f, 13.0f, 2.75f, 13.0f)
                horizontalLineTo(9.75f)
                curveTo(10.1642f, 13.0f, 10.5f, 13.3358f, 10.5f, 13.75f)
                curveTo(10.5f, 14.1642f, 10.1642f, 14.5f, 9.75f, 14.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 14.5f, 2.0f, 14.1642f, 2.0f, 13.75f)
                close()
                moveTo(2.0f, 17.75f)
                curveTo(2.0f, 17.3358f, 2.3358f, 17.0f, 2.75f, 17.0f)
                horizontalLineTo(9.75f)
                curveTo(10.1642f, 17.0f, 10.5f, 17.3358f, 10.5f, 17.75f)
                curveTo(10.5f, 18.1642f, 10.1642f, 18.5f, 9.75f, 18.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 18.5f, 2.0f, 18.1642f, 2.0f, 17.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.2113f, 12.6587f)
                curveTo(20.5379f, 12.9134f, 20.5961f, 13.3847f, 20.3414f, 13.7113f)
                lineTo(16.4414f, 18.7113f)
                curveTo(16.3022f, 18.8898f, 16.0899f, 18.9958f, 15.8636f, 18.9999f)
                curveTo(15.6373f, 19.004f, 15.4213f, 18.9057f, 15.2757f, 18.7324f)
                lineTo(13.1757f, 16.2324f)
                curveTo(12.9093f, 15.9153f, 12.9505f, 15.4422f, 13.2676f, 15.1758f)
                curveTo(13.5848f, 14.9093f, 14.0579f, 14.9505f, 14.3243f, 15.2676f)
                lineTo(15.8284f, 17.0583f)
                lineTo(19.1586f, 12.7888f)
                curveTo(19.4134f, 12.4622f, 19.8847f, 12.4039f, 20.2113f, 12.6587f)
                close()
            }
        }
            .build()
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
