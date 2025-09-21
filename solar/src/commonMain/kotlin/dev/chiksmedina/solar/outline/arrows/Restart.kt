package dev.chiksmedina.solar.outline.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ArrowsGroup

val ArrowsGroup.Restart: ImageVector
    get() {
        if (_restart != null) {
            return _restart!!
        }
        _restart = Builder(
            name = "Restart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.364f, 3.0576f)
                curveTo(18.7782f, 3.0576f, 19.114f, 3.3934f, 19.114f, 3.8076f)
                verticalLineTo(8.0503f)
                curveTo(19.114f, 8.4645f, 18.7782f, 8.8003f, 18.364f, 8.8003f)
                horizontalLineTo(14.1213f)
                curveTo(13.7071f, 8.8003f, 13.3713f, 8.4645f, 13.3713f, 8.0503f)
                curveTo(13.3713f, 7.636f, 13.7071f, 7.3003f, 14.1213f, 7.3003f)
                horizontalLineTo(16.4817f)
                curveTo(13.6363f, 5.0572f, 9.4987f, 5.2483f, 6.8735f, 7.8735f)
                curveTo(4.0422f, 10.7048f, 4.0422f, 15.2952f, 6.8735f, 18.1265f)
                curveTo(9.7048f, 20.9578f, 14.2952f, 20.9578f, 17.1265f, 18.1265f)
                curveTo(19.0234f, 16.2297f, 19.6504f, 13.5428f, 19.0039f, 11.1219f)
                curveTo(18.897f, 10.7217f, 19.1348f, 10.3106f, 19.535f, 10.2038f)
                curveTo(19.9352f, 10.0969f, 20.3462f, 10.3347f, 20.4531f, 10.7349f)
                curveTo(21.2321f, 13.6518f, 20.478f, 16.8964f, 18.1872f, 19.1872f)
                curveTo(14.7701f, 22.6043f, 9.2299f, 22.6043f, 5.8128f, 19.1872f)
                curveTo(2.3957f, 15.7701f, 2.3957f, 10.2299f, 5.8128f, 6.8128f)
                curveTo(9.0448f, 3.5808f, 14.1762f, 3.4058f, 17.614f, 6.2877f)
                verticalLineTo(3.8076f)
                curveTo(17.614f, 3.3934f, 17.9497f, 3.0576f, 18.364f, 3.0576f)
                close()
            }
        }
            .build()
        return _restart!!
    }

private var _restart: ImageVector? = null
