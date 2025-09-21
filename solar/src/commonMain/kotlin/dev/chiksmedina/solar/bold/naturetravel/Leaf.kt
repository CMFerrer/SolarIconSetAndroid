package dev.chiksmedina.solar.bold.naturetravel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.NatureTravelGroup

val NatureTravelGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(
            name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.25f, 2.0825f)
                curveTo(11.0066f, 2.1368f, 10.7675f, 2.2178f, 10.5371f, 2.3255f)
                curveTo(6.5533f, 4.1875f, 4.0f, 9.3945f, 4.0f, 13.8566f)
                curveTo(4.0f, 18.0966f, 7.1834f, 21.5797f, 11.25f, 21.9646f)
                verticalLineTo(2.0825f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 21.9646f)
                curveTo(16.8166f, 21.5797f, 20.0f, 18.0966f, 20.0f, 13.8566f)
                curveTo(20.0f, 13.4506f, 19.9789f, 13.0384f, 19.9374f, 12.6232f)
                lineTo(12.75f, 19.8106f)
                verticalLineTo(21.9646f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.2597f, 7.1796f)
                curveTo(17.8707f, 6.4548f, 17.4222f, 5.7681f, 16.92f, 5.1406f)
                lineTo(12.75f, 9.3106f)
                verticalLineTo(12.6893f)
                lineTo(18.2597f, 7.1796f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.9084f, 4.0308f)
                curveTo(15.1732f, 3.3256f, 14.3538f, 2.7419f, 13.4629f, 2.3255f)
                curveTo(13.2325f, 2.2178f, 12.9934f, 2.1368f, 12.75f, 2.0825f)
                verticalLineTo(7.1893f)
                lineTo(15.9084f, 4.0308f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.9364f, 8.6242f)
                lineTo(12.75f, 14.8106f)
                verticalLineTo(17.6893f)
                lineTo(19.5f, 10.9393f)
                lineTo(19.6319f, 10.8073f)
                curveTo(19.458f, 10.0697f, 19.2246f, 9.3363f, 18.9364f, 8.6242f)
                close()
            }
        }
            .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
