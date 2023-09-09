package com.chiksmedina.solar.lineduotone.school

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
import com.chiksmedina.solar.lineduotone.SchoolGroup

public val SchoolGroup.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 10.9111f)
                curveTo(3.0f, 10.8181f, 3.0f, 10.7716f, 3.0006f, 10.7302f)
                curveTo(3.0385f, 7.9801f, 4.9414f, 5.6079f, 7.6178f, 4.9743f)
                curveTo(7.658f, 4.9648f, 7.7034f, 4.9547f, 7.7943f, 4.9345f)
                curveTo(7.8779f, 4.9159f, 7.9197f, 4.9066f, 7.9611f, 4.8976f)
                curveTo(10.6226f, 4.3186f, 13.3774f, 4.3186f, 16.0389f, 4.8976f)
                curveTo(16.0803f, 4.9066f, 16.1221f, 4.9159f, 16.2057f, 4.9345f)
                curveTo(16.2966f, 4.9547f, 16.342f, 4.9648f, 16.3822f, 4.9743f)
                curveTo(19.0586f, 5.6079f, 20.9615f, 7.9801f, 20.9994f, 10.7302f)
                curveTo(21.0f, 10.7716f, 21.0f, 10.8181f, 21.0f, 10.9111f)
                verticalLineTo(16.375f)
                curveTo(21.0f, 18.493f, 19.529f, 20.3268f, 17.4615f, 20.7862f)
                curveTo(13.8644f, 21.5856f, 10.1356f, 21.5856f, 6.5385f, 20.7862f)
                curveTo(4.471f, 20.3268f, 3.0f, 18.493f, 3.0f, 16.375f)
                verticalLineTo(10.9111f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 15.5f)
                verticalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.9585f, 4.5f)
                curveTo(15.7205f, 3.0811f, 14.4865f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(11.0f)
                curveTo(9.5135f, 2.0f, 8.2795f, 3.0811f, 8.0415f, 4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                curveTo(8.7298f, 16.5466f, 15.2702f, 16.5466f, 21.0f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                horizontalLineTo(14.0f)
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
