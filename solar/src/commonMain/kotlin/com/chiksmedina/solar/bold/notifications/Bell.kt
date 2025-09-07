package com.chiksmedina.solar.bold.notifications

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NotificationsGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.3518f, 20.2418f)
                curveTo(9.1929f, 21.311f, 10.5142f, 22.0f, 12.0f, 22.0f)
                curveTo(13.4858f, 22.0f, 14.8071f, 21.311f, 15.6482f, 20.2418f)
                curveTo(13.2264f, 20.57f, 10.7736f, 20.57f, 8.3518f, 20.2418f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
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
        }
            .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
