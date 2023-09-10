package com.chiksmedina.solar.bold.homefurniture

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
import com.chiksmedina.solar.bold.HomeFurnitureGroup

val HomeFurnitureGroup.WashingMachine: ImageVector
    get() {
        if (_washingMachine != null) {
            return _washingMachine!!
        }
        _washingMachine = Builder(
            name = "WashingMachine", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(20.9944f, 8.25f)
                horizontalLineTo(3.0056f)
                curveTo(3.0332f, 5.6141f, 3.1972f, 4.1459f, 4.1716f, 3.1716f)
                curveTo(5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 2.0f, 18.6569f, 2.0f, 19.8284f, 3.1716f)
                curveTo(20.8028f, 4.1459f, 20.9668f, 5.6141f, 20.9944f, 8.25f)
                close()
                moveTo(5.75f, 5.5f)
                curveTo(5.75f, 5.0858f, 6.0858f, 4.75f, 6.5f, 4.75f)
                horizontalLineTo(9.5f)
                curveTo(9.9142f, 4.75f, 10.25f, 5.0858f, 10.25f, 5.5f)
                curveTo(10.25f, 5.9142f, 9.9142f, 6.25f, 9.5f, 6.25f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 6.25f, 5.75f, 5.9142f, 5.75f, 5.5f)
                close()
                moveTo(14.5f, 6.5f)
                curveTo(15.0523f, 6.5f, 15.5f, 6.0523f, 15.5f, 5.5f)
                curveTo(15.5f, 4.9477f, 15.0523f, 4.5f, 14.5f, 4.5f)
                curveTo(13.9477f, 4.5f, 13.5f, 4.9477f, 13.5f, 5.5f)
                curveTo(13.5f, 6.0523f, 13.9477f, 6.5f, 14.5f, 6.5f)
                close()
                moveTo(18.5f, 5.5f)
                curveTo(18.5f, 6.0523f, 18.0523f, 6.5f, 17.5f, 6.5f)
                curveTo(16.9477f, 6.5f, 16.5f, 6.0523f, 16.5f, 5.5f)
                curveTo(16.5f, 4.9477f, 16.9477f, 4.5f, 17.5f, 4.5f)
                curveTo(18.0523f, 4.5f, 18.5f, 4.9477f, 18.5f, 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.75f, 15.0f)
                curveTo(9.75f, 13.7574f, 10.7574f, 12.75f, 12.0f, 12.75f)
                curveTo(13.2426f, 12.75f, 14.25f, 13.7574f, 14.25f, 15.0f)
                curveTo(14.25f, 16.2426f, 13.2426f, 17.25f, 12.0f, 17.25f)
                curveTo(10.7574f, 17.25f, 9.75f, 16.2426f, 9.75f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.0f, 9.75f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 16.7712f, 21.0f, 18.6569f, 19.8284f, 19.8284f)
                curveTo(19.524f, 20.1328f, 19.1714f, 20.3582f, 18.75f, 20.5249f)
                verticalLineTo(22.0f)
                curveTo(18.75f, 22.4142f, 18.4142f, 22.75f, 18.0f, 22.75f)
                curveTo(17.5858f, 22.75f, 17.25f, 22.4142f, 17.25f, 22.0f)
                verticalLineTo(20.8713f)
                curveTo(16.1801f, 21.0f, 14.8064f, 21.0f, 13.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(9.1936f, 21.0f, 7.8199f, 21.0f, 6.75f, 20.8713f)
                verticalLineTo(22.0f)
                curveTo(6.75f, 22.4142f, 6.4142f, 22.75f, 6.0f, 22.75f)
                curveTo(5.5858f, 22.75f, 5.25f, 22.4142f, 5.25f, 22.0f)
                verticalLineTo(20.5249f)
                curveTo(4.8286f, 20.3582f, 4.476f, 20.1328f, 4.1716f, 19.8284f)
                curveTo(3.0f, 18.6569f, 3.0f, 16.7712f, 3.0f, 13.0f)
                lineTo(3.0f, 9.75f)
                close()
                moveTo(12.0f, 11.25f)
                curveTo(9.9289f, 11.25f, 8.25f, 12.9289f, 8.25f, 15.0f)
                curveTo(8.25f, 17.0711f, 9.9289f, 18.75f, 12.0f, 18.75f)
                curveTo(14.0711f, 18.75f, 15.75f, 17.0711f, 15.75f, 15.0f)
                curveTo(15.75f, 12.9289f, 14.0711f, 11.25f, 12.0f, 11.25f)
                close()
            }
        }
            .build()
        return _washingMachine!!
    }

private var _washingMachine: ImageVector? = null
