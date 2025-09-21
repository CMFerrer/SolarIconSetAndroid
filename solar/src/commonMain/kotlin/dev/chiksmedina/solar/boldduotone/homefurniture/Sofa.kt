package dev.chiksmedina.solar.boldduotone.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.HomeFurnitureGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.4444f, 18.0f)
                horizontalLineTo(5.5556f)
                curveTo(5.2785f, 18.0f, 5.0088f, 17.9683f, 4.75f, 17.9084f)
                verticalLineTo(19.0f)
                curveTo(4.75f, 19.4142f, 4.4142f, 19.75f, 4.0f, 19.75f)
                curveTo(3.5858f, 19.75f, 3.25f, 19.4142f, 3.25f, 19.0f)
                verticalLineTo(17.1513f)
                curveTo(2.4851f, 16.4991f, 2.0f, 15.5284f, 2.0f, 14.4444f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 10.8954f, 2.8954f, 10.0f, 4.0f, 10.0f)
                curveTo(5.1046f, 10.0f, 6.0f, 10.8954f, 6.0f, 12.0f)
                verticalLineTo(13.2f)
                curveTo(6.0f, 13.6418f, 6.3582f, 14.0f, 6.8f, 14.0f)
                horizontalLineTo(17.2f)
                curveTo(17.6418f, 14.0f, 18.0f, 13.6418f, 18.0f, 13.2f)
                verticalLineTo(12.0f)
                curveTo(18.0f, 10.8954f, 18.8954f, 10.0f, 20.0f, 10.0f)
                curveTo(21.1046f, 10.0f, 22.0f, 10.8954f, 22.0f, 12.0f)
                verticalLineTo(14.4444f)
                curveTo(22.0f, 15.5284f, 21.5149f, 16.4991f, 20.75f, 17.1513f)
                verticalLineTo(19.0f)
                curveTo(20.75f, 19.4142f, 20.4142f, 19.75f, 20.0f, 19.75f)
                curveTo(19.5858f, 19.75f, 19.25f, 19.4142f, 19.25f, 19.0f)
                verticalLineTo(17.9084f)
                curveTo(18.9912f, 17.9683f, 18.7215f, 18.0f, 18.4444f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0068f, 9.0f)
                curveTo(4.0153f, 8.672f, 4.0343f, 8.4338f, 4.0769f, 8.2196f)
                curveTo(4.3925f, 6.6329f, 5.6329f, 5.3925f, 7.2196f, 5.0769f)
                curveTo(7.606f, 5.0f, 8.0707f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(15.9293f, 5.0f, 16.394f, 5.0f, 16.7804f, 5.0769f)
                curveTo(18.3671f, 5.3925f, 19.6075f, 6.6329f, 19.9231f, 8.2196f)
                curveTo(19.9657f, 8.4338f, 19.9847f, 8.672f, 19.9932f, 9.0f)
                lineTo(20.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(18.8954f, 10.0f, 18.0f, 10.8954f, 18.0f, 12.0f)
                verticalLineTo(13.2f)
                curveTo(18.0f, 13.6418f, 17.6418f, 14.0f, 17.2f, 14.0f)
                horizontalLineTo(6.8f)
                curveTo(6.3582f, 14.0f, 6.0f, 13.6418f, 6.0f, 13.2f)
                verticalLineTo(12.0f)
                curveTo(6.0f, 10.8954f, 5.1046f, 10.0f, 4.0f, 10.0f)
                verticalLineTo(9.0f)
                lineTo(4.0068f, 9.0f)
                close()
            }
        }
            .build()
        return _sofa!!
    }

private var _sofa: ImageVector? = null
