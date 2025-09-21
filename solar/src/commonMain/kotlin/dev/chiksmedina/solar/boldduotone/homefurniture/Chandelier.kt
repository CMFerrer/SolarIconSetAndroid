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

val HomeFurnitureGroup.Chandelier: ImageVector
    get() {
        if (_chandelier != null) {
            return _chandelier!!
        }
        _chandelier = Builder(
            name = "Chandelier", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(11.25f, 4.75f)
                verticalLineTo(16.5f)
                curveTo(11.25f, 18.0188f, 10.0188f, 19.25f, 8.5f, 19.25f)
                curveTo(6.9812f, 19.25f, 5.75f, 18.0188f, 5.75f, 16.5f)
                verticalLineTo(15.9055f)
                horizontalLineTo(4.25f)
                verticalLineTo(16.5f)
                curveTo(4.25f, 18.8472f, 6.1528f, 20.75f, 8.5f, 20.75f)
                curveTo(9.9516f, 20.75f, 11.2333f, 20.0222f, 12.0f, 18.9116f)
                curveTo(12.7667f, 20.0222f, 14.0484f, 20.75f, 15.5f, 20.75f)
                curveTo(17.8472f, 20.75f, 19.75f, 18.8472f, 19.75f, 16.5f)
                verticalLineTo(15.9055f)
                horizontalLineTo(18.25f)
                verticalLineTo(16.5f)
                curveTo(18.25f, 18.0188f, 17.0188f, 19.25f, 15.5f, 19.25f)
                curveTo(13.9812f, 19.25f, 12.75f, 18.0188f, 12.75f, 16.5f)
                verticalLineTo(4.75f)
                horizontalLineTo(11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 3.25f)
                curveTo(8.5858f, 3.25f, 8.25f, 3.5858f, 8.25f, 4.0f)
                curveTo(8.25f, 4.4142f, 8.5858f, 4.75f, 9.0f, 4.75f)
                horizontalLineTo(11.25f)
                horizontalLineTo(12.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 4.75f, 15.75f, 4.4142f, 15.75f, 4.0f)
                curveTo(15.75f, 3.5858f, 15.4142f, 3.25f, 15.0f, 3.25f)
                horizontalLineTo(9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 13.0f)
                curveTo(16.0f, 14.3979f, 16.9561f, 15.5725f, 18.25f, 15.9055f)
                horizontalLineTo(19.75f)
                curveTo(21.0439f, 15.5725f, 22.0f, 14.3979f, 22.0f, 13.0f)
                verticalLineTo(11.2f)
                curveTo(22.0f, 10.5373f, 21.4627f, 10.0f, 20.8f, 10.0f)
                horizontalLineTo(17.2f)
                curveTo(16.5373f, 10.0f, 16.0f, 10.5373f, 16.0f, 11.2f)
                verticalLineTo(13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 13.0f)
                curveTo(2.0f, 14.3979f, 2.9561f, 15.5725f, 4.25f, 15.9055f)
                horizontalLineTo(5.75f)
                curveTo(7.0439f, 15.5725f, 8.0f, 14.3979f, 8.0f, 13.0f)
                verticalLineTo(10.8571f)
                curveTo(8.0f, 10.3838f, 7.6162f, 10.0f, 7.1429f, 10.0f)
                horizontalLineTo(2.8571f)
                curveTo(2.3838f, 10.0f, 2.0f, 10.3838f, 2.0f, 10.8571f)
                verticalLineTo(13.0f)
                close()
            }
        }
            .build()
        return _chandelier!!
    }

private var _chandelier: ImageVector? = null
