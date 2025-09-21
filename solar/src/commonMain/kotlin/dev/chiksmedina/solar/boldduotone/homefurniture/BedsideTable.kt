package dev.chiksmedina.solar.boldduotone.homefurniture

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
import dev.chiksmedina.solar.boldduotone.HomeFurnitureGroup

val HomeFurnitureGroup.BedsideTable: ImageVector
    get() {
        if (_bedsideTable != null) {
            return _bedsideTable!!
        }
        _bedsideTable = Builder(
            name = "BedsideTable", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 10.0f)
                curveTo(2.0f, 9.5581f, 2.0019f, 8.392f, 2.0038f, 8.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0019f, 8.392f, 22.0f, 9.5581f, 22.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 12.4419f, 22.0f, 13.608f, 21.9981f, 14.0f)
                horizontalLineTo(2.0019f)
                curveTo(2.0f, 13.608f, 2.0f, 12.4419f, 2.0f, 12.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 11.0f)
                curveTo(13.0f, 11.5523f, 12.5523f, 12.0f, 12.0f, 12.0f)
                curveTo(11.4477f, 12.0f, 11.0f, 11.5523f, 11.0f, 11.0f)
                curveTo(11.0f, 10.4477f, 11.4477f, 10.0f, 12.0f, 10.0f)
                curveTo(12.5523f, 10.0f, 13.0f, 10.4477f, 13.0f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0259f, 7.25f)
                curveTo(2.092f, 5.2288f, 2.3282f, 4.0151f, 3.1717f, 3.1716f)
                curveTo(4.3433f, 2.0f, 6.2289f, 2.0f, 10.0002f, 2.0f)
                horizontalLineTo(14.0002f)
                curveTo(17.7714f, 2.0f, 19.657f, 2.0f, 20.8286f, 3.1716f)
                curveTo(21.6721f, 4.0151f, 21.9083f, 5.2288f, 21.9744f, 7.25f)
                lineTo(22.0f, 8.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0259f, 7.25f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(12.5523f, 6.0f, 13.0f, 5.5523f, 13.0f, 5.0f)
                curveTo(13.0f, 4.4477f, 12.5523f, 4.0f, 12.0f, 4.0f)
                curveTo(11.4477f, 4.0f, 11.0f, 4.4477f, 11.0f, 5.0f)
                curveTo(11.0f, 5.5523f, 11.4477f, 6.0f, 12.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0259f, 14.75f)
                curveTo(2.092f, 16.7712f, 2.3282f, 17.9849f, 3.1717f, 18.8284f)
                curveTo(3.4762f, 19.1328f, 3.8288f, 19.3582f, 4.2502f, 19.5249f)
                verticalLineTo(22.0f)
                curveTo(4.2502f, 22.4142f, 4.5859f, 22.75f, 5.0002f, 22.75f)
                curveTo(5.4144f, 22.75f, 5.7502f, 22.4142f, 5.7502f, 22.0f)
                verticalLineTo(19.8713f)
                curveTo(6.82f, 20.0f, 8.1938f, 20.0f, 10.0002f, 20.0f)
                horizontalLineTo(14.0002f)
                curveTo(15.8065f, 20.0f, 17.1803f, 20.0f, 18.2502f, 19.8713f)
                verticalLineTo(22.0f)
                curveTo(18.2502f, 22.4142f, 18.5859f, 22.75f, 19.0002f, 22.75f)
                curveTo(19.4144f, 22.75f, 19.7502f, 22.4142f, 19.7502f, 22.0f)
                verticalLineTo(19.5249f)
                curveTo(20.1715f, 19.3582f, 20.5242f, 19.1328f, 20.8286f, 18.8284f)
                curveTo(21.6721f, 17.9849f, 21.9083f, 16.7712f, 21.9744f, 14.75f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0259f, 14.75f)
                close()
                moveTo(12.0002f, 18.0f)
                curveTo(12.5524f, 18.0f, 13.0002f, 17.5523f, 13.0002f, 17.0f)
                curveTo(13.0002f, 16.4477f, 12.5524f, 16.0f, 12.0002f, 16.0f)
                curveTo(11.4479f, 16.0f, 11.0002f, 16.4477f, 11.0002f, 17.0f)
                curveTo(11.0002f, 17.5523f, 11.4479f, 18.0f, 12.0002f, 18.0f)
                close()
            }
        }
            .build()
        return _bedsideTable!!
    }

private var _bedsideTable: ImageVector? = null
