package com.chiksmedina.solar.lineduotone.list

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
import com.chiksmedina.solar.lineduotone.ListGroup

public val ListGroup.PlaylistMinimalistic3: ImageVector
    get() {
        if (_playlistMinimalistic3 != null) {
            return _playlistMinimalistic3!!
        }
        _playlistMinimalistic3 = Builder(name = "PlaylistMinimalistic3", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(3.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                horizontalLineTo(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                lineTo(3.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 17.4286f)
                curveTo(16.0f, 18.8487f, 14.8807f, 20.0f, 13.5f, 20.0f)
                curveTo(12.1193f, 20.0f, 11.0f, 18.8487f, 11.0f, 17.4286f)
                curveTo(11.0f, 16.0084f, 12.1193f, 14.8571f, 13.5f, 14.8571f)
                curveTo(14.8807f, 14.8571f, 16.0f, 16.0084f, 16.0f, 17.4286f)
                close()
                moveTo(16.0f, 17.4286f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.675f, 8.1159f)
                lineTo(16.9205f, 8.9581f)
                curveTo(16.5788f, 9.1221f, 16.408f, 9.2041f, 16.2845f, 9.3306f)
                curveTo(16.1855f, 9.432f, 16.1091f, 9.5533f, 16.0605f, 9.6865f)
                curveTo(16.0f, 9.8525f, 16.0f, 10.042f, 16.0f, 10.4211f)
                curveTo(16.0f, 11.2975f, 16.0f, 11.7357f, 16.1911f, 11.9986f)
                curveTo(16.3421f, 12.2065f, 16.5673f, 12.3482f, 16.8201f, 12.3944f)
                curveTo(17.1397f, 12.4529f, 17.5348f, 12.2633f, 18.325f, 11.884f)
                lineTo(20.0795f, 11.0418f)
                curveTo(20.4212f, 10.8778f, 20.592f, 10.7958f, 20.7155f, 10.6694f)
                curveTo(20.8145f, 10.568f, 20.8909f, 10.4466f, 20.9395f, 10.3134f)
                curveTo(21.0f, 10.1474f, 21.0f, 9.9579f, 21.0f, 9.5789f)
                curveTo(21.0f, 8.7024f, 21.0f, 8.2642f, 20.8089f, 8.0013f)
                curveTo(20.6579f, 7.7935f, 20.4327f, 7.6518f, 20.1799f, 7.6055f)
                curveTo(19.8603f, 7.547f, 19.4652f, 7.7367f, 18.675f, 8.1159f)
                close()
            }
        }
        .build()
        return _playlistMinimalistic3!!
    }

private var _playlistMinimalistic3: ImageVector? = null
