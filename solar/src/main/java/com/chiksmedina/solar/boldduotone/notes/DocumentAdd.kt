package com.chiksmedina.solar.boldduotone.notes

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
import com.chiksmedina.solar.boldduotone.NotesGroup

val NotesGroup.DocumentAdd: ImageVector
    get() {
        if (_documentAdd != null) {
            return _documentAdd!!
        }
        _documentAdd = Builder(
            name = "DocumentAdd", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 6.2288f, 3.0f, 4.3432f, 4.1716f, 3.1716f)
                curveTo(5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 2.0f, 18.6569f, 2.0f, 19.8284f, 3.1716f)
                curveTo(21.0f, 4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 17.7712f, 21.0f, 19.6569f, 19.8284f, 20.8284f)
                curveTo(18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 22.0f, 5.3432f, 22.0f, 4.1716f, 20.8284f)
                curveTo(3.0f, 19.6569f, 3.0f, 17.7712f, 3.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.5189f, 16.5013f)
                curveTo(16.6939f, 16.3648f, 16.8526f, 16.2061f, 17.1701f, 15.8886f)
                lineTo(21.1275f, 11.9312f)
                curveTo(21.2231f, 11.8356f, 21.1793f, 11.6708f, 21.0515f, 11.6264f)
                curveTo(20.5844f, 11.4644f, 19.9767f, 11.1601f, 19.4083f, 10.5917f)
                curveTo(18.8399f, 10.0233f, 18.5356f, 9.4156f, 18.3736f, 8.9485f)
                curveTo(18.3292f, 8.8207f, 18.1644f, 8.7769f, 18.0688f, 8.8725f)
                lineTo(14.1114f, 12.8299f)
                curveTo(13.7939f, 13.1474f, 13.6352f, 13.3061f, 13.4987f, 13.4811f)
                curveTo(13.3377f, 13.6876f, 13.1996f, 13.9109f, 13.087f, 14.1473f)
                curveTo(12.9915f, 14.3476f, 12.9205f, 14.5606f, 12.7786f, 14.9865f)
                lineTo(12.5951f, 15.5368f)
                lineTo(12.3034f, 16.4118f)
                lineTo(12.0299f, 17.2323f)
                curveTo(11.9601f, 17.4419f, 12.0146f, 17.6729f, 12.1708f, 17.8292f)
                curveTo(12.3271f, 17.9854f, 12.5581f, 18.0399f, 12.7677f, 17.9701f)
                lineTo(13.5882f, 17.6966f)
                lineTo(14.4632f, 17.4049f)
                lineTo(15.0135f, 17.2214f)
                lineTo(15.0136f, 17.2214f)
                curveTo(15.4394f, 17.0795f, 15.6524f, 17.0085f, 15.8527f, 16.913f)
                curveTo(16.0891f, 16.8004f, 16.3124f, 16.6623f, 16.5189f, 16.5013f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.3665f, 10.6922f)
                curveTo(23.2112f, 9.8475f, 23.2112f, 8.4781f, 22.3665f, 7.6335f)
                curveTo(21.5219f, 6.7888f, 20.1525f, 6.7888f, 19.3078f, 7.6335f)
                lineTo(19.1806f, 7.7607f)
                curveTo(19.0578f, 7.8835f, 19.0022f, 8.055f, 19.0329f, 8.2259f)
                curveTo(19.0522f, 8.3334f, 19.0879f, 8.4905f, 19.153f, 8.6781f)
                curveTo(19.2831f, 9.0531f, 19.5288f, 9.5455f, 19.9917f, 10.0083f)
                curveTo(20.4545f, 10.4712f, 20.9469f, 10.7169f, 21.3219f, 10.847f)
                curveTo(21.5095f, 10.9121f, 21.6666f, 10.9478f, 21.7741f, 10.9671f)
                curveTo(21.945f, 10.9978f, 22.1165f, 10.9422f, 22.2393f, 10.8194f)
                lineTo(22.3665f, 10.6922f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.25f, 9.0f)
                curveTo(7.25f, 8.5858f, 7.5858f, 8.25f, 8.0f, 8.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 8.25f, 15.25f, 8.5858f, 15.25f, 9.0f)
                curveTo(15.25f, 9.4142f, 14.9142f, 9.75f, 14.5f, 9.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 9.75f, 7.25f, 9.4142f, 7.25f, 9.0f)
                close()
                moveTo(7.25f, 13.0f)
                curveTo(7.25f, 12.5858f, 7.5858f, 12.25f, 8.0f, 12.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 12.25f, 11.75f, 12.5858f, 11.75f, 13.0f)
                curveTo(11.75f, 13.4142f, 11.4142f, 13.75f, 11.0f, 13.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 13.75f, 7.25f, 13.4142f, 7.25f, 13.0f)
                close()
                moveTo(7.25f, 17.0f)
                curveTo(7.25f, 16.5858f, 7.5858f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(9.5f)
                curveTo(9.9142f, 16.25f, 10.25f, 16.5858f, 10.25f, 17.0f)
                curveTo(10.25f, 17.4142f, 9.9142f, 17.75f, 9.5f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.75f, 7.25f, 17.4142f, 7.25f, 17.0f)
                close()
            }
        }
            .build()
        return _documentAdd!!
    }

private var _documentAdd: ImageVector? = null
