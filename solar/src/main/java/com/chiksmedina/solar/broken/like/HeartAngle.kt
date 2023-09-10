package com.chiksmedina.solar.broken.like

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.LikeGroup

val LikeGroup.HeartAngle: ImageVector
    get() {
        if (_heartAngle != null) {
            return _heartAngle!!
        }
        _heartAngle = Builder(
            name = "HeartAngle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 5.5009f)
                lineTo(11.4596f, 6.021f)
                curveTo(11.463f, 6.0244f, 11.4664f, 6.0279f, 11.4698f, 6.0313f)
                lineTo(12.0f, 5.5009f)
                close()
                moveTo(8.9617f, 18.9111f)
                lineTo(8.4974f, 19.5001f)
                lineTo(8.4974f, 19.5001f)
                lineTo(8.9617f, 18.9111f)
                close()
                moveTo(15.0383f, 18.9111f)
                lineTo(14.574f, 18.3221f)
                lineTo(14.574f, 18.3221f)
                lineTo(15.0383f, 18.9111f)
                close()
                moveTo(7.0006f, 16.4211f)
                curveTo(6.6808f, 16.1579f, 6.2081f, 16.2038f, 5.9449f, 16.5236f)
                curveTo(5.6817f, 16.8435f, 5.7276f, 17.3161f, 6.0474f, 17.5793f)
                lineTo(7.0006f, 16.4211f)
                close()
                moveTo(2.342f, 13.4117f)
                curveTo(2.5407f, 13.7751f, 2.9965f, 13.9086f, 3.3599f, 13.7098f)
                curveTo(3.7233f, 13.5111f, 3.8568f, 13.0554f, 3.658f, 12.6919f)
                lineTo(2.342f, 13.4117f)
                close()
                moveTo(13.4698f, 8.0306f)
                curveTo(13.7627f, 8.3234f, 14.2376f, 8.3233f, 14.5304f, 8.0304f)
                curveTo(14.8233f, 7.7374f, 14.8232f, 7.2626f, 14.5302f, 6.9697f)
                lineTo(13.4698f, 8.0306f)
                close()
                moveTo(2.75f, 9.1373f)
                curveTo(2.75f, 6.9865f, 3.9654f, 5.1828f, 5.6244f, 4.4244f)
                curveTo(7.2361f, 3.6877f, 9.4017f, 3.8828f, 11.4596f, 6.021f)
                lineTo(12.5404f, 4.9808f)
                curveTo(10.0985f, 2.4438f, 7.2641f, 2.0256f, 5.0008f, 3.0602f)
                curveTo(2.7847f, 4.0732f, 1.25f, 6.4253f, 1.25f, 9.1373f)
                horizontalLineTo(2.75f)
                close()
                moveTo(8.4974f, 19.5001f)
                curveTo(9.0097f, 19.9039f, 9.5595f, 20.3345f, 10.1168f, 20.6602f)
                curveTo(10.6739f, 20.9857f, 11.3096f, 21.2502f, 12.0f, 21.2502f)
                verticalLineTo(19.7502f)
                curveTo(11.6904f, 19.7502f, 11.3261f, 19.6295f, 10.8736f, 19.3651f)
                curveTo(10.4213f, 19.1008f, 9.9521f, 18.7368f, 9.4261f, 18.3221f)
                lineTo(8.4974f, 19.5001f)
                close()
                moveTo(15.5026f, 19.5001f)
                curveTo(16.9292f, 18.3755f, 18.7528f, 17.0868f, 20.1833f, 15.476f)
                curveTo(21.6395f, 13.8363f, 22.75f, 11.8029f, 22.75f, 9.1373f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 11.3347f, 20.3508f, 13.0285f, 19.0617f, 14.48f)
                curveTo(17.7469f, 15.9605f, 16.0896f, 17.1273f, 14.574f, 18.3221f)
                lineTo(15.5026f, 19.5001f)
                close()
                moveTo(22.75f, 9.1373f)
                curveTo(22.75f, 6.4253f, 21.2153f, 4.0732f, 18.9992f, 3.0602f)
                curveTo(16.7359f, 2.0256f, 13.9015f, 2.4438f, 11.4596f, 4.9808f)
                lineTo(12.5404f, 6.021f)
                curveTo(14.5983f, 3.8828f, 16.7639f, 3.6877f, 18.3756f, 4.4244f)
                curveTo(20.0346f, 5.1828f, 21.25f, 6.9865f, 21.25f, 9.1373f)
                horizontalLineTo(22.75f)
                close()
                moveTo(14.574f, 18.3221f)
                curveTo(14.0479f, 18.7368f, 13.5787f, 19.1008f, 13.1264f, 19.3651f)
                curveTo(12.6739f, 19.6295f, 12.3096f, 19.7502f, 12.0f, 19.7502f)
                verticalLineTo(21.2502f)
                curveTo(12.6904f, 21.2502f, 13.3261f, 20.9857f, 13.8832f, 20.6602f)
                curveTo(14.4405f, 20.3345f, 14.9903f, 19.9039f, 15.5026f, 19.5001f)
                lineTo(14.574f, 18.3221f)
                close()
                moveTo(9.4261f, 18.3221f)
                curveTo(8.6301f, 17.6947f, 7.8213f, 17.0966f, 7.0006f, 16.4211f)
                lineTo(6.0474f, 17.5793f)
                curveTo(6.8777f, 18.2627f, 7.7547f, 18.9146f, 8.4974f, 19.5001f)
                lineTo(9.4261f, 18.3221f)
                close()
                moveTo(3.658f, 12.6919f)
                curveTo(3.0968f, 11.6658f, 2.75f, 10.5035f, 2.75f, 9.1373f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 10.7749f, 1.67f, 12.183f, 2.342f, 13.4117f)
                lineTo(3.658f, 12.6919f)
                close()
                moveTo(11.4698f, 6.0313f)
                lineTo(13.4698f, 8.0306f)
                lineTo(14.5302f, 6.9697f)
                lineTo(12.5302f, 4.9704f)
                lineTo(11.4698f, 6.0313f)
                close()
            }
        }
            .build()
        return _heartAngle!!
    }

private var _heartAngle: ImageVector? = null
