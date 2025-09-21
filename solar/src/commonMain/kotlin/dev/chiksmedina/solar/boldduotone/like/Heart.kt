package dev.chiksmedina.solar.boldduotone.like

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
import dev.chiksmedina.solar.boldduotone.LikeGroup

val LikeGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(
            name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(8.1063f, 18.2471f)
                curveTo(5.2982f, 16.0836f, 2.0f, 13.5424f, 2.0f, 9.1373f)
                curveTo(2.0f, 4.2744f, 7.5002f, 0.8257f, 12.0f, 5.5009f)
                verticalLineTo(20.5002f)
                curveTo(11.0f, 20.5002f, 10.0f, 19.7296f, 8.9617f, 18.9111f)
                curveTo(8.6847f, 18.6927f, 8.3981f, 18.4719f, 8.1063f, 18.2471f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0383f, 18.9111f)
                curveTo(17.9806f, 16.5917f, 22.0f, 14.0003f, 22.0f, 9.1373f)
                curveTo(22.0f, 4.2744f, 16.4998f, 0.8257f, 12.0f, 5.5009f)
                verticalLineTo(20.5002f)
                curveTo(13.0f, 20.5002f, 14.0f, 19.7296f, 15.0383f, 18.9111f)
                close()
            }
        }
            .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
