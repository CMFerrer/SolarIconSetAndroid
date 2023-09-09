package com.chiksmedina.solar.outline.notifications

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
import com.chiksmedina.solar.outline.NotificationsGroup

public val NotificationsGroup.BellOff: ImageVector
    get() {
        if (_bellOff != null) {
            return _bellOff!!
        }
        _bellOff = Builder(name = "BellOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 9.75f)
                curveTo(9.5858f, 9.75f, 9.25f, 9.4142f, 9.25f, 9.0f)
                curveTo(9.25f, 8.5858f, 9.5858f, 8.25f, 10.0f, 8.25f)
                horizontalLineTo(14.0f)
                curveTo(14.3033f, 8.25f, 14.5768f, 8.4327f, 14.6929f, 8.713f)
                curveTo(14.809f, 8.9932f, 14.7448f, 9.3158f, 14.5303f, 9.5303f)
                lineTo(11.8106f, 12.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 12.25f, 14.75f, 12.5858f, 14.75f, 13.0f)
                curveTo(14.75f, 13.4142f, 14.4142f, 13.75f, 14.0f, 13.75f)
                horizontalLineTo(10.0f)
                curveTo(9.6966f, 13.75f, 9.4232f, 13.5673f, 9.3071f, 13.287f)
                curveTo(9.191f, 13.0068f, 9.2551f, 12.6842f, 9.4697f, 12.4697f)
                lineTo(12.1893f, 9.75f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.25f, 9.0f)
                curveTo(4.25f, 4.7198f, 7.7198f, 1.25f, 12.0f, 1.25f)
                curveTo(16.2802f, 1.25f, 19.75f, 4.7198f, 19.75f, 9.0f)
                verticalLineTo(9.7041f)
                curveTo(19.75f, 10.401f, 19.9563f, 11.0824f, 20.3429f, 11.6622f)
                lineTo(21.4915f, 13.3851f)
                curveTo(22.8246f, 15.3848f, 21.8069f, 18.1028f, 19.4883f, 18.7351f)
                curveTo(18.7327f, 18.9412f, 17.9706f, 19.1155f, 17.2042f, 19.2581f)
                lineTo(17.2023f, 19.2632f)
                curveTo(16.4333f, 21.3151f, 14.378f, 22.75f, 12.0f, 22.75f)
                curveTo(9.622f, 22.75f, 7.5667f, 21.3151f, 6.7977f, 19.2632f)
                lineTo(6.7958f, 19.2581f)
                curveTo(6.0294f, 19.1155f, 5.2674f, 18.9412f, 4.5118f, 18.7351f)
                curveTo(2.1932f, 18.1028f, 1.1755f, 15.3848f, 2.5086f, 13.3851f)
                lineTo(3.6572f, 11.6622f)
                curveTo(4.0437f, 11.0824f, 4.25f, 10.401f, 4.25f, 9.7041f)
                verticalLineTo(9.0f)
                close()
                moveTo(8.6235f, 19.5369f)
                curveTo(9.3344f, 20.5585f, 10.571f, 21.25f, 12.0f, 21.25f)
                curveTo(13.4289f, 21.25f, 14.6655f, 20.5585f, 15.3764f, 19.537f)
                curveTo(13.1335f, 19.805f, 10.8664f, 19.8049f, 8.6235f, 19.5369f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(8.5483f, 2.75f, 5.75f, 5.5482f, 5.75f, 9.0f)
                verticalLineTo(9.7041f)
                curveTo(5.75f, 10.6972f, 5.4561f, 11.668f, 4.9052f, 12.4943f)
                lineTo(3.7566f, 14.2172f)
                curveTo(2.9915f, 15.3649f, 3.5756f, 16.925f, 4.9064f, 17.288f)
                curveTo(9.5507f, 18.5546f, 14.4494f, 18.5546f, 19.0936f, 17.288f)
                curveTo(20.4245f, 16.925f, 21.0086f, 15.3649f, 20.2434f, 14.2172f)
                lineTo(19.0948f, 12.4943f)
                curveTo(18.544f, 11.668f, 18.25f, 10.6972f, 18.25f, 9.7041f)
                verticalLineTo(9.0f)
                curveTo(18.25f, 5.5482f, 15.4518f, 2.75f, 12.0f, 2.75f)
                close()
            }
        }
        .build()
        return _bellOff!!
    }

private var _bellOff: ImageVector? = null
