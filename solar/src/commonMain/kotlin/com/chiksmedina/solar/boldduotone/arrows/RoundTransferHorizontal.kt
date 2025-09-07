package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.RoundTransferHorizontal: ImageVector
    get() {
        if (_roundTransferHorizontal != null) {
            return _roundTransferHorizontal!!
        }
        _roundTransferHorizontal = Builder(
            name = "RoundTransferHorizontal", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.9307f, 7.5651f)
                curveTo(11.2428f, 7.2927f, 11.275f, 6.8189f, 11.0026f, 6.5069f)
                curveTo(10.7302f, 6.1948f, 10.2565f, 6.1626f, 9.9444f, 6.4349f)
                lineTo(6.5069f, 9.4349f)
                curveTo(6.2713f, 9.6405f, 6.188f, 9.9706f, 6.2978f, 10.2634f)
                curveTo(6.4076f, 10.5561f, 6.6874f, 10.75f, 7.0f, 10.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 10.75f, 17.75f, 10.4142f, 17.75f, 10.0f)
                curveTo(17.75f, 9.5858f, 17.4142f, 9.25f, 17.0f, 9.25f)
                horizontalLineTo(9.0f)
                lineTo(10.9307f, 7.5651f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 14.75f)
                lineTo(15.0f, 14.75f)
                lineTo(13.0694f, 16.4349f)
                curveTo(12.7573f, 16.7073f, 12.7251f, 17.1811f, 12.9975f, 17.4932f)
                curveTo(13.2698f, 17.8052f, 13.7436f, 17.8374f, 14.0557f, 17.5651f)
                lineTo(17.4932f, 14.5651f)
                curveTo(17.7287f, 14.3595f, 17.8121f, 14.0294f, 17.7023f, 13.7367f)
                curveTo(17.5925f, 13.4439f, 17.3127f, 13.25f, 17.0f, 13.25f)
                horizontalLineTo(12.0f)
                lineTo(7.0f, 13.25f)
                curveTo(6.5858f, 13.25f, 6.25f, 13.5858f, 6.25f, 14.0f)
                curveTo(6.25f, 14.4142f, 6.5858f, 14.75f, 7.0f, 14.75f)
                close()
            }
        }
            .build()
        return _roundTransferHorizontal!!
    }

private var _roundTransferHorizontal: ImageVector? = null
