package com.chiksmedina.solar.linear.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MedicineGroup

val MedicineGroup.Dropper: ImageVector
    get() {
        if (_dropper != null) {
            return _dropper!!
        }
        _dropper = Builder(
            name = "Dropper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 10.0f)
                horizontalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 13.0f)
                horizontalLineTo(19.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 21.0f)
                verticalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 22.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 5.1716f, 2.0f, 3.7574f, 2.8787f, 2.8787f)
                curveTo(3.7574f, 2.0f, 5.1716f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(11.8913f)
                lineTo(11.9355f, 2.0001f)
                curveTo(12.6224f, 2.005f, 13.2869f, 2.2456f, 13.8178f, 2.6816f)
                lineTo(13.8517f, 2.7097f)
                curveTo(13.8926f, 2.7438f, 13.913f, 2.7609f, 13.9309f, 2.7753f)
                curveTo(14.5341f, 3.2625f, 15.2747f, 3.4804f, 16.0f, 3.4358f)
                moveTo(18.5f, 2.0f)
                lineTo(17.9774f, 2.5226f)
                curveTo(17.9398f, 2.5602f, 17.9209f, 2.5791f, 17.9044f, 2.5951f)
                curveTo(17.3724f, 3.111f, 16.6932f, 3.3932f, 16.0f, 3.4358f)
                moveTo(16.0f, 2.0f)
                verticalLineTo(3.4358f)
                moveTo(16.0f, 3.4358f)
                verticalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 16.5069f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 8.1144f, 22.0f, 7.1716f, 21.4142f, 6.5858f)
                curveTo(20.8284f, 6.0f, 19.8856f, 6.0f, 18.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(12.1144f, 6.0f, 11.1716f, 6.0f, 10.5858f, 6.5858f)
                curveTo(10.0f, 7.1716f, 10.0f, 8.1144f, 10.0f, 10.0f)
                verticalLineTo(16.5069f)
                curveTo(10.0f, 17.1639f, 10.277f, 17.7906f, 10.7629f, 18.2329f)
                curveTo(13.7315f, 20.935f, 18.2685f, 20.935f, 21.2371f, 18.2329f)
                curveTo(21.723f, 17.7906f, 22.0f, 17.1639f, 22.0f, 16.5069f)
                close()
            }
        }
            .build()
        return _dropper!!
    }

private var _dropper: ImageVector? = null
