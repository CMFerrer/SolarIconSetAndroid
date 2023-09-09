package com.chiksmedina.solar.linear.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ListGroup

public val ListGroup.Playlist2: ImageVector
    get() {
        if (_playlist2 != null) {
            return _playlist2!!
        }
        _playlist2 = Builder(name = "Playlist2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.4286f)
                curveTo(16.0f, 17.8487f, 14.8807f, 19.0f, 13.5f, 19.0f)
                curveTo(12.1193f, 19.0f, 11.0f, 17.8487f, 11.0f, 16.4286f)
                curveTo(11.0f, 15.0084f, 12.1193f, 13.8571f, 13.5f, 13.8571f)
                curveTo(14.8807f, 13.8571f, 16.0f, 15.0084f, 16.0f, 16.4286f)
                close()
                moveTo(16.0f, 16.4286f)
                verticalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.675f, 7.116f)
                lineTo(16.9205f, 7.9581f)
                curveTo(16.5788f, 8.1221f, 16.408f, 8.2041f, 16.2845f, 8.3306f)
                curveTo(16.1855f, 8.432f, 16.1091f, 8.5533f, 16.0605f, 8.6865f)
                curveTo(16.0f, 8.8525f, 16.0f, 9.042f, 16.0f, 9.4211f)
                curveTo(16.0f, 10.2975f, 16.0f, 10.7357f, 16.1911f, 10.9986f)
                curveTo(16.3421f, 11.2065f, 16.5673f, 11.3482f, 16.8201f, 11.3944f)
                curveTo(17.1397f, 11.4529f, 17.5348f, 11.2633f, 18.325f, 10.884f)
                lineTo(20.0795f, 10.0418f)
                curveTo(20.4212f, 9.8778f, 20.592f, 9.7958f, 20.7155f, 9.6694f)
                curveTo(20.8145f, 9.568f, 20.8909f, 9.4466f, 20.9395f, 9.3134f)
                curveTo(21.0f, 9.1474f, 21.0f, 8.9579f, 21.0f, 8.5789f)
                curveTo(21.0f, 7.7024f, 21.0f, 7.2642f, 20.8089f, 7.0013f)
                curveTo(20.6579f, 6.7935f, 20.4327f, 6.6518f, 20.1799f, 6.6055f)
                curveTo(19.8603f, 6.547f, 19.4652f, 6.7367f, 18.675f, 7.116f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                lineTo(3.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                lineTo(3.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                horizontalLineTo(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                horizontalLineTo(3.0f)
            }
        }
        .build()
        return _playlist2!!
    }

private var _playlist2: ImageVector? = null
