package com.chiksmedina.solar.boldduotone.notifications

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.NotificationsGroup

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
                pathFillType = NonZero
            ) {
                moveTo(7.2432f, 18.5449f)
                curveTo(7.8941f, 20.5501f, 9.7777f, 21.9997f, 11.9998f, 21.9997f)
                curveTo(14.222f, 21.9997f, 16.1055f, 20.5501f, 16.7565f, 18.5449f)
                curveTo(13.611f, 19.1352f, 10.3886f, 19.1352f, 7.2432f, 18.5449f)
                close()
            }
        }
            .build()
        return _bellBing!!
    }

private var _bellBing: ImageVector? = null
