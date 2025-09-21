package dev.chiksmedina.solar.lineduotone.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.HomeFurnitureGroup

val HomeFurnitureGroup.Sofa: ImageVector
    get() {
        if (_sofa != null) {
            return _sofa!!
        }
        _sofa = Builder(
            name = "Sofa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5556f, 18.0f)
                horizontalLineTo(18.4444f)
                curveTo(20.4081f, 18.0f, 22.0f, 16.4081f, 22.0f, 14.4444f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 10.8954f, 21.1046f, 10.0f, 20.0f, 10.0f)
                curveTo(18.8954f, 10.0f, 18.0f, 10.8954f, 18.0f, 12.0f)
                verticalLineTo(13.2f)
                curveTo(18.0f, 13.6418f, 17.6418f, 14.0f, 17.2f, 14.0f)
                horizontalLineTo(6.8f)
                curveTo(6.3582f, 14.0f, 6.0f, 13.6418f, 6.0f, 13.2f)
                verticalLineTo(12.0f)
                curveTo(6.0f, 10.8954f, 5.1046f, 10.0f, 4.0f, 10.0f)
                curveTo(2.8954f, 10.0f, 2.0f, 10.8954f, 2.0f, 12.0f)
                verticalLineTo(14.4444f)
                curveTo(2.0f, 16.4081f, 3.5919f, 18.0f, 5.5556f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 10.0f)
                curveTo(20.0f, 9.0707f, 20.0f, 8.606f, 19.9231f, 8.2196f)
                curveTo(19.6075f, 6.6329f, 18.3671f, 5.3925f, 16.7804f, 5.0769f)
                curveTo(16.394f, 5.0f, 15.9293f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(9.0f)
                curveTo(8.0707f, 5.0f, 7.606f, 5.0f, 7.2196f, 5.0769f)
                curveTo(5.6329f, 5.3925f, 4.3925f, 6.6329f, 4.0769f, 8.2196f)
                curveTo(4.0f, 8.606f, 4.0f, 9.0707f, 4.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 19.0f)
                verticalLineTo(18.0f)
                moveTo(4.0f, 19.0f)
                verticalLineTo(18.0f)
            }
        }
            .build()
        return _sofa!!
    }

private var _sofa: ImageVector? = null
