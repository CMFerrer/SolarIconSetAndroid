package dev.chiksmedina.solar.bold.notifications

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
import dev.chiksmedina.solar.bold.NotificationsGroup

val NotificationsGroup.BellOff: ImageVector
    get() {
        if (_bellOff != null) {
            return _bellOff!!
        }
        _bellOff = Builder(
            name = "BellOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.3518f, 20.2418f)
                curveTo(9.1929f, 21.311f, 10.5142f, 22.0f, 12.0f, 22.0f)
                curveTo(13.4858f, 22.0f, 14.8071f, 21.311f, 15.6482f, 20.2419f)
                curveTo(13.2264f, 20.57f, 10.7736f, 20.57f, 8.3518f, 20.2418f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.7491f, 9.0f)
                verticalLineTo(9.7041f)
                curveTo(18.7491f, 10.5491f, 18.9903f, 11.3752f, 19.4422f, 12.0782f)
                lineTo(20.5496f, 13.8012f)
                curveTo(21.5612f, 15.3749f, 20.789f, 17.5139f, 19.0296f, 18.0116f)
                curveTo(14.4273f, 19.3134f, 9.5727f, 19.3134f, 4.9704f, 18.0116f)
                curveTo(3.2111f, 17.5139f, 2.4388f, 15.3749f, 3.4504f, 13.8012f)
                lineTo(4.5578f, 12.0782f)
                curveTo(5.0097f, 11.3752f, 5.2509f, 10.5491f, 5.2509f, 9.7041f)
                verticalLineTo(9.0f)
                curveTo(5.2509f, 5.134f, 8.2726f, 2.0f, 12.0f, 2.0f)
                curveTo(15.7274f, 2.0f, 18.7491f, 5.134f, 18.7491f, 9.0f)
                close()
                moveTo(10.0717f, 9.75f)
                curveTo(9.6723f, 9.75f, 9.3486f, 9.4142f, 9.3486f, 9.0f)
                curveTo(9.3486f, 8.5858f, 9.6723f, 8.25f, 10.0717f, 8.25f)
                horizontalLineTo(13.9283f)
                curveTo(14.2208f, 8.25f, 14.4845f, 8.4327f, 14.5964f, 8.713f)
                curveTo(14.7083f, 8.9932f, 14.6465f, 9.3158f, 14.4397f, 9.5303f)
                lineTo(11.8175f, 12.25f)
                horizontalLineTo(13.9283f)
                curveTo(14.3277f, 12.25f, 14.6515f, 12.5858f, 14.6515f, 13.0f)
                curveTo(14.6515f, 13.4142f, 14.3277f, 13.75f, 13.9283f, 13.75f)
                horizontalLineTo(10.0717f)
                curveTo(9.7792f, 13.75f, 9.5155f, 13.5673f, 9.4036f, 13.287f)
                curveTo(9.2917f, 13.0068f, 9.3536f, 12.6842f, 9.5604f, 12.4697f)
                lineTo(12.1826f, 9.75f)
                horizontalLineTo(10.0717f)
                close()
            }
        }
            .build()
        return _bellOff!!
    }

private var _bellOff: ImageVector? = null
