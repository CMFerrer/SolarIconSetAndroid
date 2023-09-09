package com.chiksmedina.solar.bold.arrowsaction

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
import com.chiksmedina.solar.bold.ArrowsActionGroup

public val ArrowsActionGroup.CircleBottomUp: ImageVector
    get() {
        if (_circleBottomUp != null) {
            return _circleBottomUp!!
        }
        _circleBottomUp = Builder(name = "CircleBottomUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.4697f, 21.5303f)
                curveTo(2.1768f, 21.2374f, 2.1768f, 20.7626f, 2.4697f, 20.4697f)
                lineTo(10.1893f, 12.75f)
                horizontalLineTo(6.6563f)
                curveTo(6.242f, 12.75f, 5.9063f, 12.4142f, 5.9063f, 12.0f)
                curveTo(5.9063f, 11.5858f, 6.242f, 11.25f, 6.6563f, 11.25f)
                horizontalLineTo(12.0f)
                curveTo(12.4142f, 11.25f, 12.75f, 11.5858f, 12.75f, 12.0f)
                verticalLineTo(17.3438f)
                curveTo(12.75f, 17.758f, 12.4142f, 18.0938f, 12.0f, 18.0938f)
                curveTo(11.5858f, 18.0938f, 11.25f, 17.758f, 11.25f, 17.3438f)
                verticalLineTo(13.8107f)
                lineTo(3.5303f, 21.5303f)
                curveTo(3.2374f, 21.8232f, 2.7626f, 21.8232f, 2.4697f, 21.5303f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5183f, 17.2997f)
                lineTo(6.5697f, 14.2484f)
                curveTo(5.3671f, 14.2029f, 4.4063f, 13.2136f, 4.4063f, 12.0f)
                curveTo(4.4063f, 10.7574f, 5.4136f, 9.75f, 6.6563f, 9.75f)
                horizontalLineTo(12.0f)
                curveTo(13.2426f, 9.75f, 14.25f, 10.7574f, 14.25f, 12.0f)
                verticalLineTo(17.3438f)
                curveTo(14.25f, 18.5864f, 13.2426f, 19.5937f, 12.0f, 19.5937f)
                curveTo(10.7864f, 19.5937f, 9.7971f, 18.6329f, 9.7516f, 17.4303f)
                lineTo(6.7003f, 20.4817f)
                curveTo(8.2368f, 21.4438f, 10.0534f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 13.9466f, 2.5562f, 15.7632f, 3.5183f, 17.2997f)
                close()
            }
        }
        .build()
        return _circleBottomUp!!
    }

private var _circleBottomUp: ImageVector? = null
