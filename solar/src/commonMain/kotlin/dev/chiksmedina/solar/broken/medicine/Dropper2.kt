package dev.chiksmedina.solar.broken.medicine

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
import dev.chiksmedina.solar.broken.MedicineGroup

val MedicineGroup.Dropper2: ImageVector
    get() {
        if (_dropper2 != null) {
            return _dropper2!!
        }
        _dropper2 = Builder(
            name = "Dropper2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 10.0f)
                horizontalLineTo(19.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 12.9167f)
                curveTo(18.0f, 14.0673f, 17.1046f, 15.0f, 16.0f, 15.0f)
                curveTo(14.8954f, 15.0f, 14.0f, 14.0673f, 14.0f, 12.9167f)
                curveTo(14.0f, 12.1968f, 14.783f, 11.2359f, 15.3691f, 10.6175f)
                curveTo(15.7161f, 10.2514f, 16.2839f, 10.2514f, 16.6309f, 10.6175f)
                curveTo(17.217f, 11.2359f, 18.0f, 12.1968f, 18.0f, 12.9167f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 13.0f)
                horizontalLineTo(20.0f)
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
                moveTo(10.0f, 10.0f)
                curveTo(10.0f, 8.1144f, 10.0f, 7.1716f, 10.5858f, 6.5858f)
                curveTo(11.1716f, 6.0f, 12.1144f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 6.0f, 20.8284f, 6.0f, 21.4142f, 6.5858f)
                curveTo(22.0f, 7.1716f, 22.0f, 8.1144f, 22.0f, 10.0f)
                verticalLineTo(16.5069f)
                curveTo(22.0f, 17.1639f, 21.723f, 17.7906f, 21.2371f, 18.2329f)
                curveTo(18.2685f, 20.935f, 13.7315f, 20.935f, 10.7629f, 18.2329f)
                curveTo(10.277f, 17.7906f, 10.0f, 17.1639f, 10.0f, 16.5069f)
                verticalLineTo(14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 22.0f)
                verticalLineTo(20.0f)
                moveTo(18.5f, 2.0f)
                lineTo(17.9774f, 2.5226f)
                curveTo(17.9398f, 2.5602f, 17.9209f, 2.5791f, 17.9044f, 2.5951f)
                curveTo(17.3724f, 3.111f, 16.6932f, 3.3932f, 16.0f, 3.4358f)
                moveTo(16.0f, 2.0f)
                verticalLineTo(3.4358f)
                moveTo(16.0f, 3.4358f)
                verticalLineTo(6.0f)
                moveTo(16.0f, 3.4358f)
                curveTo(15.2747f, 3.4804f, 14.5341f, 3.2625f, 13.9309f, 2.7753f)
                curveTo(13.913f, 2.7609f, 13.8926f, 2.7438f, 13.8517f, 2.7097f)
                lineTo(13.8178f, 2.6816f)
                curveTo(13.2869f, 2.2456f, 12.6224f, 2.005f, 11.9355f, 2.0001f)
                lineTo(11.8913f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 2.0f, 3.7574f, 2.0f, 2.8787f, 2.8787f)
                curveTo(2.0f, 3.7574f, 2.0f, 5.1716f, 2.0f, 8.0f)
                verticalLineTo(16.0f)
            }
        }
            .build()
        return _dropper2!!
    }

private var _dropper2: ImageVector? = null
