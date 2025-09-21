package dev.chiksmedina.solar.boldduotone.foodkitchen

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
import dev.chiksmedina.solar.boldduotone.FoodKitchenGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
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
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.0017f, 13.0f)
                curveTo(3.0f, 12.6878f, 3.0f, 12.355f, 3.0f, 12.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 5.1144f, 3.0f, 4.1716f, 3.5858f, 3.5858f)
                curveTo(4.1716f, 3.0f, 5.1144f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(13.0f)
                curveTo(14.8856f, 3.0f, 15.8284f, 3.0f, 16.4142f, 3.5858f)
                curveTo(16.649f, 3.8206f, 16.7897f, 4.1128f, 16.874f, 4.5f)
                horizontalLineTo(18.0f)
                curveTo(20.5261f, 4.5f, 22.75f, 6.3119f, 22.75f, 8.75f)
                curveTo(22.75f, 11.1882f, 20.5261f, 13.0f, 18.0f, 13.0f)
                horizontalLineTo(3.0017f)
                close()
                moveTo(16.9957f, 6.0f)
                curveTo(17.0f, 6.3004f, 17.0f, 6.6323f, 17.0f, 7.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(18.0f)
                curveTo(19.8921f, 11.5f, 21.25f, 10.1778f, 21.25f, 8.75f)
                curveTo(21.25f, 7.3222f, 19.8921f, 6.0f, 18.0f, 6.0f)
                horizontalLineTo(16.9957f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0002f, 18.0f)
                horizontalLineTo(11.0002f)
                curveTo(13.8286f, 18.0f, 15.2429f, 18.0f, 16.1215f, 17.1213f)
                curveTo(16.8899f, 16.3529f, 16.9864f, 15.175f, 16.9985f, 13.0f)
                horizontalLineTo(3.002f)
                curveTo(3.0141f, 15.175f, 3.1105f, 16.3529f, 3.8789f, 17.1213f)
                curveTo(4.7576f, 18.0f, 6.1718f, 18.0f, 9.0002f, 18.0f)
                close()
            }
        }
            .build()
        return _cup!!
    }

private var _cup: ImageVector? = null
