package dev.chiksmedina.solar.bold.foodkitchen

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
import dev.chiksmedina.solar.bold.FoodKitchenGroup

val FoodKitchenGroup.Cup: ImageVector
    get() {
        if (_cup != null) {
            return _cup!!
        }
        _cup = Builder(
            name = "Cup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 7.0f)
                curveTo(3.0f, 5.1144f, 3.0f, 4.1716f, 3.5858f, 3.5858f)
                curveTo(4.1716f, 3.0f, 5.1144f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(14.8856f, 3.0f, 15.8284f, 3.0f, 16.4142f, 3.5858f)
                curveTo(16.5956f, 3.7672f, 16.7208f, 3.9828f, 16.8073f, 4.25f)
                horizontalLineTo(18.0f)
                curveTo(20.6234f, 4.25f, 22.75f, 6.3766f, 22.75f, 9.0f)
                curveTo(22.75f, 11.6234f, 20.6234f, 13.75f, 18.0f, 13.75f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.25f)
                horizontalLineTo(18.0f)
                curveTo(19.7949f, 12.25f, 21.25f, 10.7949f, 21.25f, 9.0f)
                curveTo(21.25f, 7.2051f, 19.7949f, 5.75f, 18.0f, 5.75f)
                horizontalLineTo(16.9908f)
                curveTo(17.0f, 6.1135f, 17.0f, 6.5271f, 17.0f, 7.0f)
                verticalLineTo(12.25f)
                horizontalLineTo(3.0f)
                lineTo(3.0f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.011f, 13.75f)
                horizontalLineTo(16.9891f)
                curveTo(16.9528f, 15.4553f, 16.7963f, 16.4463f, 16.1213f, 17.1213f)
                curveTo(15.2426f, 18.0f, 13.8284f, 18.0f, 11.0f, 18.0f)
                horizontalLineTo(9.0f)
                curveTo(6.1716f, 18.0f, 4.7574f, 18.0f, 3.8787f, 17.1213f)
                curveTo(3.2037f, 16.4463f, 3.0472f, 15.4553f, 3.011f, 13.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 21.0f)
                curveTo(1.25f, 20.5858f, 1.5858f, 20.25f, 2.0f, 20.25f)
                lineTo(22.0f, 20.25f)
                curveTo(22.4142f, 20.25f, 22.75f, 20.5858f, 22.75f, 21.0f)
                curveTo(22.75f, 21.4142f, 22.4142f, 21.75f, 22.0f, 21.75f)
                lineTo(2.0f, 21.75f)
                curveTo(1.5858f, 21.75f, 1.25f, 21.4142f, 1.25f, 21.0f)
                close()
            }
        }
            .build()
        return _cup!!
    }

private var _cup: ImageVector? = null
