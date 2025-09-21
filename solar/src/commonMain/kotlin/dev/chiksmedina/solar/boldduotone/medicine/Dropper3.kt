package dev.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.MedicineGroup

val MedicineGroup.Dropper3: ImageVector
    get() {
        if (_dropper3 != null) {
            return _dropper3!!
        }
        _dropper3 = Builder(
            name = "Dropper3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
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
                moveTo(13.25f, 16.0f)
                curveTo(13.25f, 15.5858f, 13.5858f, 15.25f, 14.0f, 15.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 15.25f, 18.75f, 15.5858f, 18.75f, 16.0f)
                curveTo(18.75f, 16.4142f, 18.4142f, 16.75f, 18.0f, 16.75f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 16.75f, 13.25f, 16.4142f, 13.25f, 16.0f)
                close()
                moveTo(16.0f, 13.4999f)
                curveTo(17.1046f, 13.4999f, 18.0f, 12.5672f, 18.0f, 11.4166f)
                curveTo(18.0f, 10.6967f, 17.217f, 9.7358f, 16.6309f, 9.1174f)
                curveTo(16.2839f, 8.7512f, 15.7161f, 8.7512f, 15.3691f, 9.1174f)
                curveTo(14.783f, 9.7358f, 14.0f, 10.6967f, 14.0f, 11.4166f)
                curveTo(14.0f, 12.5672f, 14.8954f, 13.4999f, 16.0f, 13.4999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.2937f, 2.1019f)
                curveTo(13.6301f, 1.557f, 12.7996f, 1.2563f, 11.9409f, 1.2501f)
                lineTo(11.8927f, 1.25f)
                horizontalLineTo(7.9451f)
                curveTo(6.5775f, 1.25f, 5.4752f, 1.25f, 4.6083f, 1.3665f)
                curveTo(3.7081f, 1.4875f, 2.9503f, 1.7464f, 2.3484f, 2.3484f)
                curveTo(1.7464f, 2.9503f, 1.4875f, 3.7081f, 1.3665f, 4.6083f)
                curveTo(1.25f, 5.4752f, 1.25f, 6.5775f, 1.25f, 7.9451f)
                lineTo(1.25f, 22.25f)
                curveTo(1.25f, 22.6642f, 1.5858f, 23.0f, 2.0f, 23.0f)
                curveTo(2.4142f, 23.0f, 2.75f, 22.6642f, 2.75f, 22.25f)
                verticalLineTo(8.0f)
                curveTo(2.75f, 6.5646f, 2.7516f, 5.5635f, 2.8531f, 4.8081f)
                curveTo(2.9518f, 4.0743f, 3.1323f, 3.6858f, 3.409f, 3.409f)
                curveTo(3.6858f, 3.1323f, 4.0743f, 2.9518f, 4.8081f, 2.8531f)
                lineTo(8.0f, 2.75f)
                horizontalLineTo(11.8907f)
                lineTo(11.9301f, 2.7501f)
                lineTo(11.932f, 2.7501f)
                curveTo(12.4459f, 2.7542f, 12.9429f, 2.9342f, 13.3403f, 3.26f)
                lineTo(13.3418f, 3.2612f)
                lineTo(13.3726f, 3.2868f)
                lineTo(13.3767f, 3.2902f)
                curveTo(13.4124f, 3.32f, 13.4373f, 3.3407f, 13.4597f, 3.3588f)
                curveTo(13.9929f, 3.7894f, 14.6125f, 4.0517f, 15.25f, 4.1487f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.75f)
                verticalLineTo(4.0735f)
                curveTo(17.3633f, 3.9161f, 17.9437f, 3.6017f, 18.4266f, 3.1335f)
                curveTo(18.4473f, 3.1133f, 18.47f, 3.0907f, 18.5033f, 3.0574f)
                lineTo(19.0303f, 2.5303f)
                curveTo(19.3232f, 2.2374f, 19.3232f, 1.7626f, 19.0303f, 1.4697f)
                curveTo(18.7374f, 1.1768f, 18.2626f, 1.1768f, 17.9697f, 1.4697f)
                lineTo(17.4471f, 1.9923f)
                curveTo(17.4075f, 2.0318f, 17.3937f, 2.0457f, 17.3823f, 2.0567f)
                curveTo(17.1927f, 2.2405f, 16.9785f, 2.3847f, 16.75f, 2.4889f)
                verticalLineTo(2.0f)
                curveTo(16.75f, 1.5858f, 16.4142f, 1.25f, 16.0f, 1.25f)
                curveTo(15.5858f, 1.25f, 15.25f, 1.5858f, 15.25f, 2.0f)
                verticalLineTo(2.6196f)
                curveTo(14.9482f, 2.5413f, 14.6588f, 2.3991f, 14.4022f, 2.1919f)
                lineTo(14.3318f, 2.1336f)
                lineTo(14.2969f, 2.1045f)
                lineTo(14.2937f, 2.1019f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.25f, 20.2234f)
                verticalLineTo(21.25f)
                curveTo(15.25f, 21.6642f, 15.5858f, 22.0f, 16.0f, 22.0f)
                curveTo(16.4142f, 22.0f, 16.75f, 21.6642f, 16.75f, 21.25f)
                verticalLineTo(20.2234f)
                curveTo(16.2512f, 20.2715f, 15.7488f, 20.2715f, 15.25f, 20.2234f)
                close()
            }
        }
            .build()
        return _dropper3!!
    }

private var _dropper3: ImageVector? = null
