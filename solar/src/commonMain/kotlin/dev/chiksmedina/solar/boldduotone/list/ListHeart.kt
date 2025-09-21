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

val ListGroup.ListHeart: ImageVector
    get() {
        if (_listHeart != null) {
            return _listHeart!!
        }
        _listHeart = Builder(
            name = "ListHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 5.5858f, 2.5858f, 5.25f, 3.0f, 5.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 5.25f, 21.75f, 5.5858f, 21.75f, 6.0f)
                curveTo(21.75f, 6.4142f, 21.4142f, 6.75f, 21.0f, 6.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 6.75f, 2.25f, 6.4142f, 2.25f, 6.0f)
                close()
                moveTo(2.25f, 10.0f)
                curveTo(2.25f, 9.5858f, 2.5858f, 9.25f, 3.0f, 9.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 9.25f, 21.75f, 9.5858f, 21.75f, 10.0f)
                curveTo(21.75f, 10.4142f, 21.4142f, 10.75f, 21.0f, 10.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 10.75f, 2.25f, 10.4142f, 2.25f, 10.0f)
                close()
                moveTo(2.25f, 14.0f)
                curveTo(2.25f, 13.5858f, 2.5858f, 13.25f, 3.0f, 13.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 13.25f, 10.75f, 13.5858f, 10.75f, 14.0f)
                curveTo(10.75f, 14.4142f, 10.4142f, 14.75f, 10.0f, 14.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 14.75f, 2.25f, 14.4142f, 2.25f, 14.0f)
                close()
                moveTo(2.25f, 18.0f)
                curveTo(2.25f, 17.5858f, 2.5858f, 17.25f, 3.0f, 17.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 17.25f, 10.75f, 17.5858f, 10.75f, 18.0f)
                curveTo(10.75f, 18.4142f, 10.4142f, 18.75f, 10.0f, 18.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 18.75f, 2.25f, 18.4142f, 2.25f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 15.0361f)
                curveTo(14.0f, 16.2709f, 15.4849f, 17.5789f, 16.5203f, 18.3408f)
                curveTo(16.9546f, 18.6603f, 17.1717f, 18.8201f, 17.5f, 18.8201f)
                curveTo(17.8283f, 18.8201f, 18.0454f, 18.6603f, 18.4797f, 18.3408f)
                curveTo(19.5151f, 17.5789f, 21.0f, 16.2709f, 21.0f, 15.0361f)
                curveTo(21.0f, 13.0282f, 19.0749f, 12.2786f, 17.5f, 13.8296f)
                curveTo(15.9251f, 12.2786f, 14.0f, 13.0282f, 14.0f, 15.0361f)
                close()
            }
        }
            .build()
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
