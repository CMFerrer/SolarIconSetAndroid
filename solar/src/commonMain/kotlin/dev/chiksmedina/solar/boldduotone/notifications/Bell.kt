package dev.chiksmedina.solar.boldduotone.notifications

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.NotificationsGroup

val NotificationsGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(
            name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
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
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.2434f, 18.5449f)
                curveTo(7.8944f, 20.5501f, 9.7779f, 21.9997f, 12.0001f, 21.9997f)
                curveTo(14.2222f, 21.9997f, 16.1058f, 20.5501f, 16.7567f, 18.5449f)
                curveTo(13.6113f, 19.1352f, 10.3888f, 19.1352f, 7.2434f, 18.5449f)
                close()
            }
        }
            .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
