package com.chiksmedina.solar.lineduotone.homefurniture

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
import com.chiksmedina.solar.lineduotone.HomeFurnitureGroup

val HomeFurnitureGroup.Sofa2: ImageVector
    get() {
        if (_sofa2 != null) {
            return _sofa2!!
        }
        _sofa2 = Builder(
            name = "Sofa2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.7804f, 5.0769f)
                lineTo(16.634f, 5.8124f)
                lineTo(16.634f, 5.8124f)
                lineTo(16.7804f, 5.0769f)
                close()
                moveTo(19.9231f, 8.2196f)
                lineTo(20.6587f, 8.0733f)
                lineTo(20.6587f, 8.0733f)
                lineTo(19.9231f, 8.2196f)
                close()
                moveTo(7.2196f, 5.0769f)
                lineTo(7.366f, 5.8124f)
                lineTo(7.366f, 5.8124f)
                lineTo(7.2196f, 5.0769f)
                close()
                moveTo(4.0769f, 8.2196f)
                lineTo(4.8124f, 8.366f)
                lineTo(4.8124f, 8.366f)
                lineTo(4.0769f, 8.2196f)
                close()
                moveTo(9.0f, 5.75f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.25f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.75f)
                close()
                moveTo(15.0f, 5.75f)
                curveTo(15.9653f, 5.75f, 16.3384f, 5.7536f, 16.634f, 5.8124f)
                lineTo(16.9267f, 4.3413f)
                curveTo(16.4496f, 4.2464f, 15.8934f, 4.25f, 15.0f, 4.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(20.75f, 10.0f)
                curveTo(20.75f, 9.1066f, 20.7536f, 8.5504f, 20.6587f, 8.0733f)
                lineTo(19.1876f, 8.366f)
                curveTo(19.2464f, 8.6616f, 19.25f, 9.0347f, 19.25f, 10.0f)
                horizontalLineTo(20.75f)
                close()
                moveTo(16.634f, 5.8124f)
                curveTo(17.9233f, 6.0689f, 18.9311f, 7.0767f, 19.1876f, 8.366f)
                lineTo(20.6587f, 8.0733f)
                curveTo(20.2839f, 6.189f, 18.811f, 4.7161f, 16.9267f, 4.3413f)
                lineTo(16.634f, 5.8124f)
                close()
                moveTo(9.0f, 4.25f)
                curveTo(8.1066f, 4.25f, 7.5504f, 4.2464f, 7.0733f, 4.3413f)
                lineTo(7.366f, 5.8124f)
                curveTo(7.6616f, 5.7536f, 8.0347f, 5.75f, 9.0f, 5.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(4.75f, 10.0f)
                curveTo(4.75f, 9.0347f, 4.7536f, 8.6616f, 4.8124f, 8.366f)
                lineTo(3.3413f, 8.0733f)
                curveTo(3.2464f, 8.5504f, 3.25f, 9.1066f, 3.25f, 10.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(7.0733f, 4.3413f)
                curveTo(5.189f, 4.7161f, 3.7161f, 6.189f, 3.3413f, 8.0733f)
                lineTo(4.8124f, 8.366f)
                curveTo(5.0689f, 7.0767f, 6.0767f, 6.0689f, 7.366f, 5.8124f)
                lineTo(7.0733f, 4.3413f)
                close()
                moveTo(11.25f, 5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.25f)
                close()
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
        return _sofa2!!
    }

private var _sofa2: ImageVector? = null
