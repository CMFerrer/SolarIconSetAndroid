package com.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MedicineGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9409f, 1.2501f)
                curveTo(12.7996f, 1.2563f, 13.6301f, 1.557f, 14.2937f, 2.102f)
                lineTo(14.2969f, 2.1045f)
                lineTo(14.3318f, 2.1336f)
                lineTo(14.4022f, 2.1919f)
                curveTo(14.6588f, 2.3991f, 14.9482f, 2.5413f, 15.25f, 2.6196f)
                verticalLineTo(2.0f)
                curveTo(15.25f, 1.5858f, 15.5858f, 1.25f, 16.0f, 1.25f)
                curveTo(16.4142f, 1.25f, 16.75f, 1.5858f, 16.75f, 2.0f)
                verticalLineTo(2.4889f)
                curveTo(16.9785f, 2.3847f, 17.1927f, 2.2405f, 17.3823f, 2.0567f)
                curveTo(17.3937f, 2.0457f, 17.4075f, 2.0318f, 17.4471f, 1.9923f)
                lineTo(17.9697f, 1.4697f)
                curveTo(18.2626f, 1.1768f, 18.7374f, 1.1768f, 19.0303f, 1.4697f)
                curveTo(19.3232f, 1.7626f, 19.3232f, 2.2374f, 19.0303f, 2.5303f)
                lineTo(18.5033f, 3.0574f)
                curveTo(18.47f, 3.0907f, 18.4473f, 3.1133f, 18.4266f, 3.1335f)
                curveTo(17.9437f, 3.6017f, 17.3633f, 3.9161f, 16.75f, 4.0735f)
                verticalLineTo(5.25f)
                lineTo(18.052f, 5.25f)
                curveTo(18.9505f, 5.25f, 19.6997f, 5.2499f, 20.2945f, 5.3299f)
                curveTo(20.9223f, 5.4143f, 21.4891f, 5.6f, 21.9445f, 6.0555f)
                curveTo(22.4f, 6.5109f, 22.5857f, 7.0777f, 22.6701f, 7.7055f)
                curveTo(22.7501f, 8.3003f, 22.75f, 9.0495f, 22.75f, 9.9479f)
                lineTo(22.75f, 16.5069f)
                curveTo(22.75f, 17.3751f, 22.384f, 18.2031f, 21.742f, 18.7875f)
                curveTo(20.3125f, 20.0887f, 18.5512f, 20.8185f, 16.7496f, 20.9767f)
                curveTo(16.7499f, 20.9844f, 16.75f, 20.9922f, 16.75f, 21.0f)
                verticalLineTo(22.0f)
                curveTo(16.75f, 22.4142f, 16.4142f, 22.75f, 16.0f, 22.75f)
                curveTo(15.5858f, 22.75f, 15.25f, 22.4142f, 15.25f, 22.0f)
                verticalLineTo(21.0f)
                curveTo(15.25f, 20.9922f, 15.2501f, 20.9844f, 15.2504f, 20.9767f)
                curveTo(13.4488f, 20.8185f, 11.6875f, 20.0887f, 10.258f, 18.7875f)
                curveTo(9.616f, 18.2031f, 9.25f, 17.3751f, 9.25f, 16.5069f)
                lineTo(9.25f, 9.948f)
                curveTo(9.25f, 9.0495f, 9.25f, 8.3003f, 9.3299f, 7.7055f)
                curveTo(9.4143f, 7.0777f, 9.6f, 6.5109f, 10.0555f, 6.0555f)
                curveTo(10.5109f, 5.6f, 11.0777f, 5.4143f, 11.7055f, 5.3299f)
                curveTo(12.3003f, 5.2499f, 13.0495f, 5.25f, 13.948f, 5.25f)
                lineTo(15.25f, 5.25f)
                verticalLineTo(4.1487f)
                curveTo(14.6125f, 4.0517f, 13.9929f, 3.7894f, 13.4597f, 3.3588f)
                curveTo(13.4374f, 3.3408f, 13.4125f, 3.32f, 13.3768f, 3.2903f)
                lineTo(13.3726f, 3.2868f)
                lineTo(13.3418f, 3.2612f)
                lineTo(13.3403f, 3.26f)
                curveTo(12.9429f, 2.9342f, 12.4459f, 2.7542f, 11.932f, 2.7501f)
                lineTo(11.9301f, 2.7501f)
                lineTo(11.8907f, 2.75f)
                horizontalLineTo(8.0f)
                lineTo(4.8081f, 2.8531f)
                curveTo(4.0743f, 2.9518f, 3.6858f, 3.1323f, 3.409f, 3.409f)
                curveTo(3.1323f, 3.6858f, 2.9518f, 4.0743f, 2.8531f, 4.8081f)
                curveTo(2.7516f, 5.5635f, 2.75f, 6.5646f, 2.75f, 8.0f)
                verticalLineTo(22.25f)
                curveTo(2.75f, 22.6642f, 2.4142f, 23.0f, 2.0f, 23.0f)
                curveTo(1.5858f, 23.0f, 1.25f, 22.6642f, 1.25f, 22.25f)
                verticalLineTo(7.9451f)
                curveTo(1.25f, 6.5775f, 1.25f, 5.4752f, 1.3665f, 4.6083f)
                curveTo(1.4875f, 3.7081f, 1.7464f, 2.9503f, 2.3484f, 2.3484f)
                curveTo(2.9503f, 1.7464f, 3.7081f, 1.4875f, 4.6083f, 1.3665f)
                curveTo(5.4752f, 1.25f, 6.5775f, 1.25f, 7.9451f, 1.25f)
                horizontalLineTo(11.8927f)
                lineTo(11.9409f, 1.2501f)
                close()
                moveTo(11.9054f, 6.8165f)
                curveTo(11.4439f, 6.8786f, 11.2464f, 6.9858f, 11.1161f, 7.1161f)
                curveTo(10.9858f, 7.2464f, 10.8786f, 7.4439f, 10.8165f, 7.9054f)
                curveTo(10.7516f, 8.3884f, 10.75f, 9.036f, 10.75f, 10.0f)
                verticalLineTo(16.5069f)
                curveTo(10.75f, 16.9528f, 10.938f, 17.3781f, 11.2677f, 17.6783f)
                curveTo(13.9502f, 20.1199f, 18.0499f, 20.1199f, 20.7323f, 17.6783f)
                curveTo(21.062f, 17.3781f, 21.25f, 16.9528f, 21.25f, 16.5069f)
                verticalLineTo(10.0f)
                curveTo(21.25f, 9.036f, 21.2484f, 8.3884f, 21.1835f, 7.9054f)
                curveTo(21.1214f, 7.4439f, 21.0142f, 7.2464f, 20.8839f, 7.1161f)
                curveTo(20.7536f, 6.9858f, 20.5561f, 6.8786f, 20.0946f, 6.8165f)
                curveTo(19.6116f, 6.7516f, 18.964f, 6.75f, 18.0f, 6.75f)
                horizontalLineTo(14.0f)
                curveTo(13.036f, 6.75f, 12.3884f, 6.7516f, 11.9054f, 6.8165f)
                close()
            }
        }
            .build()
        return _dropper!!
    }

private var _dropper: ImageVector? = null
