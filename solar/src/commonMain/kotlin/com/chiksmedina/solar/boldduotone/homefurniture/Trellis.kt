package com.chiksmedina.solar.boldduotone.homefurniture

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
import com.chiksmedina.solar.boldduotone.HomeFurnitureGroup

val HomeFurnitureGroup.Trellis: ImageVector
    get() {
        if (_trellis != null) {
            return _trellis!!
        }
        _trellis = Builder(
            name = "Trellis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5f, 15.0f)
                verticalLineTo(6.1375f)
                curveTo(20.5f, 5.7495f, 20.5f, 5.5556f, 20.4822f, 5.4229f)
                curveTo(20.359f, 4.5069f, 19.8459f, 3.9451f, 18.9449f, 3.7395f)
                curveTo(18.8144f, 3.7097f, 18.5428f, 3.6851f, 18.0f, 3.6357f)
                curveTo(16.9981f, 3.5446f, 15.8169f, 3.1959f, 14.7687f, 2.8145f)
                curveTo(13.2754f, 2.2713f, 12.5288f, 1.9996f, 12.0f, 1.9996f)
                curveTo(11.4712f, 1.9996f, 10.7246f, 2.2713f, 9.2313f, 2.8145f)
                curveTo(8.1831f, 3.1959f, 7.0019f, 3.5446f, 6.0f, 3.6357f)
                curveTo(5.4571f, 3.6851f, 5.1856f, 3.7097f, 5.0551f, 3.7395f)
                curveTo(4.1541f, 3.9451f, 3.641f, 4.5069f, 3.5178f, 5.4229f)
                curveTo(3.5f, 5.5556f, 3.5f, 5.7495f, 3.5f, 6.1375f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0303f, 8.5303f)
                curveTo(14.3232f, 8.2374f, 14.3232f, 7.7626f, 14.0303f, 7.4697f)
                curveTo(13.7374f, 7.1768f, 13.2626f, 7.1768f, 12.9697f, 7.4697f)
                lineTo(9.9697f, 10.4697f)
                curveTo(9.6768f, 10.7626f, 9.6768f, 11.2374f, 9.9697f, 11.5303f)
                curveTo(10.2626f, 11.8232f, 10.7374f, 11.8232f, 11.0303f, 11.5303f)
                lineTo(14.0303f, 8.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0303f, 7.5303f)
                curveTo(11.3232f, 7.2374f, 11.3232f, 6.7626f, 11.0303f, 6.4697f)
                curveTo(10.7374f, 6.1768f, 10.2626f, 6.1768f, 9.9697f, 6.4697f)
                lineTo(8.9697f, 7.4697f)
                curveTo(8.6768f, 7.7626f, 8.6768f, 8.2374f, 8.9697f, 8.5303f)
                curveTo(9.2626f, 8.8232f, 9.7374f, 8.8232f, 10.0303f, 8.5303f)
                lineTo(11.0303f, 7.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0303f, 11.5303f)
                curveTo(15.3232f, 11.2374f, 15.3232f, 10.7626f, 15.0303f, 10.4697f)
                curveTo(14.7374f, 10.1768f, 14.2626f, 10.1768f, 13.9697f, 10.4697f)
                lineTo(12.9697f, 11.4697f)
                curveTo(12.6768f, 11.7626f, 12.6768f, 12.2374f, 12.9697f, 12.5303f)
                curveTo(13.2626f, 12.8232f, 13.7374f, 12.8232f, 14.0303f, 12.5303f)
                lineTo(15.0303f, 11.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.0002f, 15.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0002f)
                curveTo(7.1228f, 21.0f, 6.3815f, 21.0f, 5.75f, 20.9738f)
                verticalLineTo(22.0f)
                curveTo(5.75f, 22.4142f, 5.4142f, 22.75f, 5.0f, 22.75f)
                curveTo(4.5858f, 22.75f, 4.25f, 22.4142f, 4.25f, 22.0f)
                verticalLineTo(20.8109f)
                curveTo(3.6692f, 20.6845f, 3.2311f, 20.4735f, 2.8789f, 20.1213f)
                curveTo(2.1105f, 19.3529f, 2.0141f, 18.175f, 2.002f, 16.0001f)
                curveTo(1.9989f, 15.4478f, 2.4479f, 15.0f, 3.0002f, 15.0f)
                close()
                moveTo(6.25f, 18.0f)
                curveTo(6.25f, 17.5858f, 6.5858f, 17.25f, 7.0f, 17.25f)
                lineTo(9.0f, 17.25f)
                curveTo(9.4142f, 17.25f, 9.75f, 17.5858f, 9.75f, 18.0f)
                curveTo(9.75f, 18.4142f, 9.4142f, 18.75f, 9.0f, 18.75f)
                lineTo(7.0f, 18.75f)
                curveTo(6.5858f, 18.75f, 6.25f, 18.4142f, 6.25f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.0002f, 21.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0002f)
                curveTo(21.5525f, 15.0f, 22.0016f, 15.4478f, 21.9985f, 16.0001f)
                curveTo(21.9864f, 18.175f, 21.8899f, 19.3529f, 21.1216f, 20.1213f)
                curveTo(20.7693f, 20.4736f, 20.331f, 20.6846f, 19.75f, 20.811f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5858f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(20.9738f)
                curveTo(17.6186f, 21.0f, 16.8774f, 21.0f, 16.0002f, 21.0f)
                close()
                moveTo(15.0f, 17.25f)
                curveTo(14.5858f, 17.25f, 14.25f, 17.5858f, 14.25f, 18.0f)
                curveTo(14.25f, 18.4142f, 14.5858f, 18.75f, 15.0f, 18.75f)
                lineTo(17.0f, 18.75f)
                curveTo(17.4142f, 18.75f, 17.75f, 18.4142f, 17.75f, 18.0f)
                curveTo(17.75f, 17.5858f, 17.4142f, 17.25f, 17.0f, 17.25f)
                lineTo(15.0f, 17.25f)
                close()
            }
        }
            .build()
        return _trellis!!
    }

private var _trellis: ImageVector? = null
