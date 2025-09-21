package dev.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.DiplomaVerified: ImageVector
    get() {
        if (_diplomaVerified != null) {
            return _diplomaVerified!!
        }
        _diplomaVerified = Builder(
            name = "DiplomaVerified", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.9451f, 1.25f)
                horizontalLineTo(16.0549f)
                curveTo(17.4225f, 1.25f, 18.5248f, 1.25f, 19.3918f, 1.3665f)
                curveTo(20.2919f, 1.4875f, 21.0497f, 1.7464f, 21.6517f, 2.3484f)
                curveTo(22.2536f, 2.9503f, 22.5125f, 3.7081f, 22.6335f, 4.6083f)
                curveTo(22.75f, 5.4752f, 22.75f, 6.5775f, 22.75f, 7.9451f)
                verticalLineTo(12.0549f)
                curveTo(22.75f, 13.4225f, 22.75f, 14.5248f, 22.6335f, 15.3918f)
                curveTo(22.5125f, 16.2919f, 22.2536f, 17.0497f, 21.6517f, 17.6516f)
                curveTo(21.1537f, 18.1496f, 20.5469f, 18.4146f, 19.8361f, 18.5593f)
                curveTo(19.1459f, 18.6998f, 18.3133f, 18.7352f, 17.3276f, 18.7457f)
                lineTo(17.322f, 18.7458f)
                lineTo(17.0976f, 18.7464f)
                curveTo(17.0008f, 19.0506f, 16.8435f, 19.34f, 16.6255f, 19.5958f)
                curveTo(16.4944f, 19.7496f, 16.4152f, 19.9408f, 16.3991f, 20.1423f)
                curveTo(16.303f, 21.3466f, 15.3466f, 22.303f, 14.1423f, 22.3991f)
                curveTo(13.9409f, 22.4152f, 13.7496f, 22.4944f, 13.5958f, 22.6255f)
                curveTo(12.6762f, 23.4091f, 11.3238f, 23.4091f, 10.4042f, 22.6255f)
                curveTo(10.2504f, 22.4944f, 10.0592f, 22.4152f, 9.8577f, 22.3991f)
                curveTo(8.6534f, 22.303f, 7.697f, 21.3466f, 7.6009f, 20.1423f)
                curveTo(7.5848f, 19.9409f, 7.5056f, 19.7496f, 7.3745f, 19.5958f)
                curveTo(7.1568f, 19.3403f, 6.9996f, 19.0514f, 6.9029f, 18.7477f)
                curveTo(5.8625f, 18.7407f, 4.9917f, 18.7125f, 4.2764f, 18.5811f)
                curveTo(3.5184f, 18.4418f, 2.8733f, 18.1766f, 2.3484f, 17.6517f)
                curveTo(1.7464f, 17.0497f, 1.4875f, 16.2919f, 1.3665f, 15.3918f)
                curveTo(1.25f, 14.5248f, 1.25f, 13.4225f, 1.25f, 12.0549f)
                verticalLineTo(7.9451f)
                curveTo(1.25f, 6.5775f, 1.25f, 5.4752f, 1.3665f, 4.6083f)
                curveTo(1.4875f, 3.7081f, 1.7464f, 2.9503f, 2.3484f, 2.3484f)
                curveTo(2.9503f, 1.7464f, 3.7081f, 1.4875f, 4.6083f, 1.3665f)
                curveTo(5.4752f, 1.25f, 6.5775f, 1.25f, 7.9451f, 1.25f)
                close()
                moveTo(6.9043f, 17.2476f)
                curveTo(7.0012f, 16.9456f, 7.1579f, 16.6584f, 7.3745f, 16.4042f)
                curveTo(7.5056f, 16.2504f, 7.5848f, 16.0592f, 7.6009f, 15.8577f)
                curveTo(7.697f, 14.6534f, 8.6534f, 13.697f, 9.8577f, 13.6009f)
                curveTo(10.0592f, 13.5848f, 10.2504f, 13.5056f, 10.4042f, 13.3745f)
                curveTo(11.3238f, 12.5909f, 12.6762f, 12.5909f, 13.5958f, 13.3745f)
                curveTo(13.7496f, 13.5056f, 13.9409f, 13.5848f, 14.1423f, 13.6009f)
                curveTo(15.3466f, 13.697f, 16.303f, 14.6534f, 16.3991f, 15.8577f)
                curveTo(16.4152f, 16.0592f, 16.4944f, 16.2504f, 16.6255f, 16.4042f)
                curveTo(16.8418f, 16.658f, 16.9984f, 16.9448f, 17.0953f, 17.2464f)
                lineTo(17.3144f, 17.2457f)
                curveTo(18.2997f, 17.2352f, 19.0022f, 17.1983f, 19.5368f, 17.0895f)
                curveTo(20.0513f, 16.9847f, 20.359f, 16.8229f, 20.591f, 16.591f)
                curveTo(20.8678f, 16.3142f, 21.0482f, 15.9257f, 21.1469f, 15.1919f)
                curveTo(21.2484f, 14.4365f, 21.25f, 13.4354f, 21.25f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(21.25f, 6.5646f, 21.2484f, 5.5635f, 21.1469f, 4.8081f)
                curveTo(21.0482f, 4.0743f, 20.8678f, 3.6858f, 20.591f, 3.409f)
                curveTo(20.3142f, 3.1323f, 19.9257f, 2.9518f, 19.1919f, 2.8531f)
                curveTo(18.4365f, 2.7516f, 17.4354f, 2.75f, 16.0f, 2.75f)
                horizontalLineTo(8.0f)
                curveTo(6.5646f, 2.75f, 5.5635f, 2.7516f, 4.8081f, 2.8531f)
                curveTo(4.0743f, 2.9518f, 3.6858f, 3.1323f, 3.409f, 3.409f)
                curveTo(3.1323f, 3.6858f, 2.9518f, 4.0743f, 2.8531f, 4.8081f)
                curveTo(2.7516f, 5.5635f, 2.75f, 6.5646f, 2.75f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(2.75f, 13.4354f, 2.7516f, 14.4365f, 2.8531f, 15.1919f)
                curveTo(2.9518f, 15.9257f, 3.1323f, 16.3142f, 3.409f, 16.591f)
                curveTo(3.6525f, 16.8344f, 3.9805f, 17.0016f, 4.5473f, 17.1057f)
                curveTo(5.1175f, 17.2105f, 5.8632f, 17.2404f, 6.9043f, 17.2476f)
                close()
                moveTo(8.25f, 6.0f)
                curveTo(8.25f, 5.5858f, 8.5858f, 5.25f, 9.0f, 5.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 5.25f, 15.75f, 5.5858f, 15.75f, 6.0f)
                curveTo(15.75f, 6.4142f, 15.4142f, 6.75f, 15.0f, 6.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 6.75f, 8.25f, 6.4142f, 8.25f, 6.0f)
                close()
                moveTo(6.25f, 9.5f)
                curveTo(6.25f, 9.0858f, 6.5858f, 8.75f, 7.0f, 8.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 8.75f, 17.75f, 9.0858f, 17.75f, 9.5f)
                curveTo(17.75f, 9.9142f, 17.4142f, 10.25f, 17.0f, 10.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 10.25f, 6.25f, 9.9142f, 6.25f, 9.5f)
                close()
                moveTo(12.6229f, 14.5162f)
                curveTo(12.264f, 14.2103f, 11.736f, 14.2103f, 11.3771f, 14.5162f)
                curveTo(10.9831f, 14.852f, 10.4931f, 15.055f, 9.977f, 15.0961f)
                curveTo(9.507f, 15.1337f, 9.1337f, 15.5069f, 9.0962f, 15.977f)
                curveTo(9.055f, 16.4931f, 8.852f, 16.9831f, 8.5162f, 17.3771f)
                curveTo(8.2103f, 17.736f, 8.2103f, 18.264f, 8.5162f, 18.6229f)
                curveTo(8.852f, 19.0169f, 9.055f, 19.5069f, 9.0962f, 20.023f)
                curveTo(9.1337f, 20.4931f, 9.507f, 20.8663f, 9.977f, 20.9039f)
                curveTo(10.4931f, 20.945f, 10.9831f, 21.148f, 11.3771f, 21.4838f)
                curveTo(11.736f, 21.7897f, 12.264f, 21.7897f, 12.6229f, 21.4838f)
                curveTo(13.0169f, 21.148f, 13.5069f, 20.945f, 14.023f, 20.9039f)
                curveTo(14.4931f, 20.8663f, 14.8663f, 20.4931f, 14.9039f, 20.023f)
                curveTo(14.945f, 19.5069f, 15.148f, 19.0169f, 15.4838f, 18.6229f)
                curveTo(15.7897f, 18.264f, 15.7897f, 17.736f, 15.4838f, 17.3771f)
                curveTo(15.148f, 16.9831f, 14.945f, 16.4931f, 14.9039f, 15.977f)
                curveTo(14.8663f, 15.5069f, 14.4931f, 15.1337f, 14.023f, 15.0961f)
                curveTo(13.5069f, 15.055f, 13.0169f, 14.852f, 12.6229f, 14.5162f)
                close()
                moveTo(12.9883f, 16.4517f)
                curveTo(13.2911f, 16.1691f, 13.7657f, 16.1854f, 14.0483f, 16.4883f)
                curveTo(14.3309f, 16.7911f, 14.3146f, 17.2657f, 14.0117f, 17.5483f)
                lineTo(11.8689f, 19.5483f)
                curveTo(11.5807f, 19.8172f, 11.1336f, 19.8172f, 10.8454f, 19.5483f)
                lineTo(9.9883f, 18.7483f)
                curveTo(9.6854f, 18.4657f, 9.6691f, 17.9911f, 9.9517f, 17.6883f)
                curveTo(10.2343f, 17.3854f, 10.7089f, 17.3691f, 11.0117f, 17.6517f)
                lineTo(11.3571f, 17.9741f)
                lineTo(12.9883f, 16.4517f)
                close()
            }
        }
            .build()
        return _diplomaVerified!!
    }

private var _diplomaVerified: ImageVector? = null
