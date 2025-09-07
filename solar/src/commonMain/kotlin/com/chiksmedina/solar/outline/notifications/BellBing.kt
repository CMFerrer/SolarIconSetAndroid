package com.chiksmedina.solar.outline.notifications

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
import com.chiksmedina.solar.outline.NotificationsGroup

val NotificationsGroup.BellBing: ImageVector
    get() {
        if (_bellBing != null) {
            return _bellBing!!
        }
        _bellBing = Builder(
            name = "BellBing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 6.0f)
                curveTo(12.75f, 5.5858f, 12.4142f, 5.25f, 12.0f, 5.25f)
                curveTo(11.5858f, 5.25f, 11.25f, 5.5858f, 11.25f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(11.25f, 10.4142f, 11.5858f, 10.75f, 12.0f, 10.75f)
                curveTo(12.4142f, 10.75f, 12.75f, 10.4142f, 12.75f, 10.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.2501f, 9.0f)
                curveTo(4.2501f, 4.7198f, 7.7199f, 1.25f, 12.0001f, 1.25f)
                curveTo(16.2803f, 1.25f, 19.7501f, 4.7198f, 19.7501f, 9.0f)
                verticalLineTo(9.7041f)
                curveTo(19.7501f, 10.401f, 19.9564f, 11.0824f, 20.3429f, 11.6622f)
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
                curveTo(4.0438f, 11.0824f, 4.2501f, 10.401f, 4.2501f, 9.7041f)
                verticalLineTo(9.0f)
                close()
                moveTo(8.6235f, 19.5369f)
                curveTo(10.8665f, 19.8049f, 13.1335f, 19.805f, 15.3765f, 19.537f)
                curveTo(14.6655f, 20.5585f, 13.429f, 21.25f, 12.0f, 21.25f)
                curveTo(10.571f, 21.25f, 9.3345f, 20.5585f, 8.6235f, 19.5369f)
                close()
                moveTo(12.0001f, 2.75f)
                curveTo(8.5483f, 2.75f, 5.7501f, 5.5482f, 5.7501f, 9.0f)
                verticalLineTo(9.7041f)
                curveTo(5.7501f, 10.6972f, 5.4561f, 11.668f, 4.9053f, 12.4943f)
                lineTo(3.7567f, 14.2172f)
                curveTo(2.9915f, 15.3649f, 3.5756f, 16.925f, 4.9065f, 17.288f)
                curveTo(9.5507f, 18.5546f, 14.4494f, 18.5546f, 19.0937f, 17.288f)
                curveTo(20.4245f, 16.925f, 21.0086f, 15.3649f, 20.2435f, 14.2172f)
                lineTo(19.0949f, 12.4943f)
                curveTo(18.544f, 11.668f, 18.2501f, 10.6972f, 18.2501f, 9.7041f)
                verticalLineTo(9.0f)
                curveTo(18.2501f, 5.5482f, 15.4518f, 2.75f, 12.0001f, 2.75f)
                close()
            }
        }
            .build()
        return _bellBing!!
    }

private var _bellBing: ImageVector? = null
